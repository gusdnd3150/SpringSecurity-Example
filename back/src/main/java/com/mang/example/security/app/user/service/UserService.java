package com.mang.example.security.app.user.service;

import com.mang.example.security.app.user.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User signUp(User user);

    Optional<User> findByEmail(String userEmail);

    List<User> findAll();

}
