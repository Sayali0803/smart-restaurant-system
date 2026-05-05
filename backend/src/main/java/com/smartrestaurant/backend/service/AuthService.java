package com.smartrestaurant.backend.service;

import com.smartrestaurant.backend.dto.AuthRequest;
import com.smartrestaurant.backend.dto.LoginRequest;

public interface AuthService {

    String register(AuthRequest request);
    String login(LoginRequest request);
}