package com.streamlinetech.dr_recovery.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.streamlinetech.dr_recovery.entity.User;
import com.streamlinetech.dr_recovery.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String uname)
            throws UsernameNotFoundException {

        // Find user from database
        User user = userRepository.findByUname(uname)
                .orElseThrow(() ->
                    new UsernameNotFoundException("User not found"));

        // Convert database user into Spring Security UserDetails
        return org.springframework.security.core.userdetails.User
                .withUsername(user.getUname())
                .password(user.getPassword())
                .roles(user.getRole().name())
                .disabled(!user.isActive())
                .build();
    }
}