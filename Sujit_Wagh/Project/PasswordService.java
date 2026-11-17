package com.streamlinetech.dr_recovery.service;

import com.streamlinetech.dr_recovery.dto.*;

public interface PasswordService {

    String forgotPassword(ForgotPasswordRequest request);

    String resetPassword(ResetPasswordRequest request);

}