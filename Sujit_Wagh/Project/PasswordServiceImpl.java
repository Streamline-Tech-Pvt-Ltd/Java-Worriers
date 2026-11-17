package com.streamlinetech.dr_recovery.serviceimpl;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.streamlinetech.dr_recovery.dto.*;
import com.streamlinetech.dr_recovery.entity.*;
import com.streamlinetech.dr_recovery.repository.*;
import com.streamlinetech.dr_recovery.service.*;

@Service
public class PasswordServiceImpl implements PasswordService {

    private final UserRepository userRepository;
    private final PasswordResetTokenRepository tokenRepository;
    private final PasswordEncoder passwordEncoder;
    private final EmailService emailService;

    @Value("${app.password-reset.expiration:900000}")
    private long expiration;

    private final SecureRandom secureRandom = new SecureRandom();

    public PasswordServiceImpl(
            UserRepository userRepository,
            PasswordResetTokenRepository tokenRepository,
            PasswordEncoder passwordEncoder,
            EmailService emailService) {

        this.userRepository = userRepository;
        this.tokenRepository = tokenRepository;
        this.passwordEncoder = passwordEncoder;
        this.emailService = emailService;
    }

    @Override
    @Transactional
    public String forgotPassword(ForgotPasswordRequest request) {

        User user = userRepository
            .findByEmail(request.getEmail())
            .orElseThrow(() ->
                new RuntimeException("If the account exists, a reset email will be sent"));

        if (!user.isActive()) {
            throw new RuntimeException("Account is inactive");
        }

        // Generate secure random token
        byte[] randomBytes = new byte[32];

        secureRandom.nextBytes(randomBytes);

        String token = Base64.getUrlEncoder()
                .withoutPadding()
                .encodeToString(randomBytes);

        // Delete old token
        tokenRepository.deleteByUser(user);

        // Store token hash, not the original token
        String tokenHash = hashToken(token);

        LocalDateTime expiryDate =
                LocalDateTime.now()
                .plusNanos(expiration * 1_000_000);

        PasswordResetToken resetToken =
                new PasswordResetToken(
                    tokenHash,
                    user,
                    expiryDate
                );

        tokenRepository.save(resetToken);

        // Send original token through email
        emailService.sendResetPasswordEmail(
            user.getEmail(),
            token
        );

        return "If the account exists, a reset email will be sent";
    }

    @Override
    @Transactional
    public String resetPassword(ResetPasswordRequest request) {

        String tokenHash = hashToken(request.getToken());

        PasswordResetToken resetToken =
            tokenRepository.findByTokenHash(tokenHash)
                .orElseThrow(() ->
                    new RuntimeException("Invalid reset token"));

        if (resetToken.getExpiryDate()
                .isBefore(LocalDateTime.now())) {

            tokenRepository.delete(resetToken);

            throw new RuntimeException("Reset token expired");
        }

        User user = resetToken.getUser();

        if (!user.isActive()) {
            throw new RuntimeException("Account is inactive");
        }

        if (request.getNewPassword() == null ||
                request.getNewPassword().length() < 8) {

            throw new RuntimeException(
                "Password must contain at least 8 characters");
        }

        // Encrypt new password
        user.setPassword(
            passwordEncoder.encode(request.getNewPassword())
        );

        userRepository.save(user);

        // Token can only be used once
        tokenRepository.delete(resetToken);

        return "Password reset successfully";
    }

    private String hashToken(String token) {

        try {

            MessageDigest digest =
                MessageDigest.getInstance("SHA-256");

            byte[] hash = digest.digest(
                token.getBytes(StandardCharsets.UTF_8)
            );

            return java.util.HexFormat.of().formatHex(hash);

        } catch (Exception e) {

            throw new RuntimeException(
                "Unable to process reset token", e);
        }
    }
}