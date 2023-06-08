package com.springboot.reg_login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.reg_login.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
