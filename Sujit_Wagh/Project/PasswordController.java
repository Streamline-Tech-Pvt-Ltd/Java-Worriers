package com.streamlinetech.dr_recovery.controller;

import org.springframework.web.bind.annotation.*;

import com.streamlinetech.dr_recovery.dto.*;
import com.streamlinetech.dr_recovery.service.PasswordService;

@RestController
@RequestMapping("/api/auth")
public class PasswordController {

    private final PasswordService passwordService;

    public PasswordController(
            PasswordService passwordService) {

        this.passwordService = passwordService;
    }

    @PostMapping("/forgot-password")
    public String forgotPassword(
            @RequestBody ForgotPasswordRequest request) {

        return passwordService.forgotPassword(request);
    }

    @PostMapping("/reset-password")
    public String resetPassword(
            @RequestBody ResetPasswordRequest request) {

        return passwordService.resetPassword(request);
    }
}