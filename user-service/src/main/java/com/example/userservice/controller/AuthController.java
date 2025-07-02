package com.example.userservice.controller;

import com.example.userservice.payload.request.LoginDto;
import com.example.userservice.payload.request.SignupDto;
import com.example.userservice.payload.response.ApiResponse;
import com.example.userservice.payload.response.ApiResponseBody;
import com.example.userservice.payload.response.AuthResponse;
import com.example.userservice.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {


    private final AuthService authService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ApiResponse> HomeControllerHandler() {

        return ResponseEntity.status(
                        HttpStatus.OK)
                .body(new ApiResponse(

                        "welcome to property booking system, user api"

                ));
    }

    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ApiResponseBody<AuthResponse>> signupHandler(
            @RequestBody SignupDto req) throws Exception {

        System.out.println("signup dto "+req);
        AuthResponse response=authService.signup(req);

        return ResponseEntity.ok(new ApiResponseBody<>(
                true,
                "User created successfully", response)
        );
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ApiResponseBody<AuthResponse>> loginHandler(
            @RequestBody LoginDto req) throws Exception {

        AuthResponse response=authService.login(req.getEmail(), req.getPassword());

        return ResponseEntity.ok(new ApiResponseBody<>(
                true,
                "User logged in successfully",
                response)
        );
    }

    @GetMapping("/access-token/refresh-token/{refreshToken}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ApiResponseBody<AuthResponse>> getAccessTokenHandler(
            @PathVariable String refreshToken) throws Exception {

        AuthResponse response = authService.getAccessTokenFromRefreshToken(refreshToken);

        return ResponseEntity.ok(new ApiResponseBody<>(
                true,
                "refresh token received successfully",
                response
        ));
    }

}