package com.streamlinetech.dr_recovery.service;

import com.streamlinetech.dr_recovery.dto.*;

public interface AuthService {

    String register(RegisterRequest request);

    AuthResponse login(LoginRequest request);

}