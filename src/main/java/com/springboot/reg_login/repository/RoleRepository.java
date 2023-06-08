package com.springboot.reg_login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.reg_login.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
