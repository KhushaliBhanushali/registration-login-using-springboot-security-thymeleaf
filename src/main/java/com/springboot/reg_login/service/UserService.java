package com.springboot.reg_login.service;

import java.util.List;

import com.springboot.reg_login.dto.UserDto;
import com.springboot.reg_login.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
