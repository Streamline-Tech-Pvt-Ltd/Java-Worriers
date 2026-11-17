package com.streamlinetech.dr_recovery.serviceimpl;

import org.springframework.stereotype.Service;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.streamlinetech.dr_recovery.dto.*;
import com.streamlinetech.dr_recovery.entity.*;
import com.streamlinetech.dr_recovery.repository.UserRepository;
import com.streamlinetech.dr_recovery.security.JwtService;
import com.streamlinetech.dr_recovery.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    public AuthServiceImpl(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder,
            AuthenticationManager authenticationManager,
            JwtService jwtService) {

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
    }


@Override
public String register(RegisterRequest request) {

    if (request.getEmail() == null ||
            request.getEmail().isBlank()) {
        throw new RuntimeException("Email is required");
    }

    if (request.getUname() == null ||
            request.getUname().isBlank()) {
        throw new RuntimeException("Username is required");
    }

    if (request.getPassword() == null ||
            request.getPassword().length() < 8) {
        throw new RuntimeException(
            "Password must contain at least 8 characters"
        );
    }

    if (userRepository.existsByEmail(request.getEmail())) {
        throw new RuntimeException("Email already exists");
    }

    if (userRepository.existsByUname(request.getUname())) {
        throw new RuntimeException("Username already exists");
    }

    User user = new User();

    user.setUname(request.getUname());

    user.setEmail(request.getEmail());

    user.setPassword(
        passwordEncoder.encode(request.getPassword())
    );

    // Public registration: Employee only
    user.setRole(Role.EMPLOYEE);

    user.setActive(true);

    userRepository.save(user);

    return "Employee registered successfully";
}

    @Override
    public AuthResponse login(LoginRequest request) {

        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                request.getUname(),
                request.getPassword()
            )
        );

        User user = userRepository
            .findByUname(request.getUname())
            .orElseThrow(() ->
                new RuntimeException("User not found"));

        String token = jwtService.generateToken(
            user.getUname()
        );

        return new AuthResponse(
            token,
            "Login successful",
            user.getRole().name()
        );
    }
}