package com.example.userservice.service;


import com.example.userservice.payload.request.SignupDto;
import com.example.userservice.payload.response.AuthResponse;

public interface AuthService {

    AuthResponse login(String username, String password) throws Exception;

    AuthResponse signup(SignupDto req) throws Exception;

    AuthResponse getAccessTokenFromRefreshToken(String refreshToken) throws Exception;
}
