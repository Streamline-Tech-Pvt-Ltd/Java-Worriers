package com.streamlinetech.dr_recovery.service;

public interface EmailService {

    void sendResetPasswordEmail(
        String email,
        String token
    );
}