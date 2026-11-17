package com.streamlinetech.dr_recovery.serviceimpl;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.streamlinetech.dr_recovery.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {

    private final JavaMailSender mailSender;

    public EmailServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void sendResetPasswordEmail(
            String email, String token) {

        SimpleMailMessage message =
                new SimpleMailMessage();

        message.setTo(email);

        message.setSubject("DR Recovery - Password Reset");

        message.setText(
            "Hello,\n\n" +
            "Your password reset token is:\n\n" +
            token +
            "\n\nThis token is valid for 15 minutes.\n" +
            "If you did not request this, ignore this email."
        );

        mailSender.send(message);
    }
}