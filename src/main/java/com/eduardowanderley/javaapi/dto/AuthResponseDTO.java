package com.eduardowanderley.javaapi.dto;

public class AuthResponseDTO {
    private String token;

    public AuthResponseDTO() {}
    public AuthResponseDTO(String token) {
        this.token = token;
    }
    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }
} 