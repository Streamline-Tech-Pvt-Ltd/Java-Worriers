package com.streamlinetech.dr_recovery.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.streamlinetech.dr_recovery.entity.User;

public interface UserRepository
        extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByUname(String uname);

    boolean existsByEmail(String email);

    boolean existsByUname(String uname);

}