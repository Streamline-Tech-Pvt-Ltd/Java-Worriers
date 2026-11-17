package com.streamlinetech.dr_recovery.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.streamlinetech.dr_recovery.entity.Role;
import com.streamlinetech.dr_recovery.entity.User;
import com.streamlinetech.dr_recovery.repository.UserRepository;

import org.springframework.security.crypto.password.PasswordEncoder;

@Component
public class BootstrapAdminRunner implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Value("${app.bootstrap-admin.username:}")
    private String username;

    @Value("${app.bootstrap-admin.email:}")
    private String email;

    @Value("${app.bootstrap-admin.password:}")
    private String password;

    public BootstrapAdminRunner(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder) {

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {

        if (username.isBlank() ||
            email.isBlank() ||
            password.isBlank()) {
            return;
        }

        boolean adminExists = userRepository.findAll()
            .stream()
            .anyMatch(user -> user.getRole() == Role.ADMIN);

        if (adminExists) {
            return;
        }

        if (userRepository.existsByEmail(email) ||
            userRepository.existsByUname(username)) {
            throw new IllegalStateException(
                "Bootstrap admin username or email already exists");
        }

        User admin = new User(
            username,
            passwordEncoder.encode(password),
            email,
            Role.ADMIN
        );

        userRepository.save(admin);
    }
}