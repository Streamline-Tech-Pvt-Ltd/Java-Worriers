public package com.streamlinetech.dr_recovery.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "password_reset_tokens")
public class PasswordResetToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "token_hash",
            nullable = false, unique = true, length = 64)
    private String tokenHash;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",
                nullable = false, unique = true)
    private User user;

    @Column(name = "expiry_date", nullable = false)
    private LocalDateTime expiryDate;

    public PasswordResetToken() {
    }

    public PasswordResetToken(
            String tokenHash,
            User user,
            LocalDateTime expiryDate) {

        this.tokenHash = tokenHash;
        this.user = user;
        this.expiryDate = expiryDate;
    }

    public Long getId() {
        return id;
    }

    public String getTokenHash() {
        return tokenHash;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }
} {
    
}
