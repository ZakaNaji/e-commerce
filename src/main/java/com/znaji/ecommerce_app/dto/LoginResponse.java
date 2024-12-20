package com.znaji.ecommerce_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {

    private String token;
    private String username;
    private List<String> roles;

    public LoginResponse(String username, List<String> roles) {
        this.username = username;
        this.roles = roles;
    }
}
