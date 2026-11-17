public package com.streamlinetech.dr_recovery.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.streamlinetech.dr_recovery.entity.PasswordResetToken;
import com.streamlinetech.dr_recovery.entity.User;

public interface PasswordResetTokenRepository
        extends JpaRepository<PasswordResetToken, Long> {

    Optional<PasswordResetToken> findByTokenHash(
        String tokenHash
    );

    void deleteByUser(User user);
} {
    
}
