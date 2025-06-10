package com.eduardowanderley.javaapi.controller;

import com.eduardowanderley.javaapi.dto.AuthRequestDTO;
import com.eduardowanderley.javaapi.dto.AuthResponseDTO;
import com.eduardowanderley.javaapi.dto.RegisterRequestDTO;
import com.eduardowanderley.javaapi.service.AuthenticationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthenticationService authenticationService;

    public AuthController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponseDTO> register(@RequestBody RegisterRequestDTO request) {
        AuthResponseDTO response = authenticationService.register(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> login(@RequestBody AuthRequestDTO request) {
        AuthResponseDTO response = authenticationService.login(request);
        return ResponseEntity.ok(response);
    }
} 