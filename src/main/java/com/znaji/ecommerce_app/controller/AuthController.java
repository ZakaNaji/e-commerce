package com.znaji.ecommerce_app.controller;

import com.znaji.ecommerce_app.dto.LoginRequest;
import com.znaji.ecommerce_app.dto.LoginResponse;
import com.znaji.ecommerce_app.security.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth/")
@Slf4j
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtUtils jwtUtils;

    public AuthController(AuthenticationManager authenticationManager, JwtUtils jwtUtils) {
        this.authenticationManager = authenticationManager;
        this.jwtUtils = jwtUtils;
    }

    @PostMapping("login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        final Authentication authentication;
        try {
            authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
            );
        } catch (Exception e) {
            log.error("Cannot authenticate user: {}", e);
            return ResponseEntity.badRequest().body("Invalid credentials");
        }
        SecurityContextHolder.getContext().setAuthentication(authentication);
        final UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        final ResponseCookie jwtCookie = jwtUtils.generateJwtCookie(userDetails);
        final List<String> roles = userDetails.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .toList();
        LoginResponse loginResponse = new LoginResponse(userDetails.getUsername(), roles);
        return ResponseEntity
                .ok()
                .header(HttpHeaders.SET_COOKIE, jwtCookie.toString())
                .body(loginResponse);
    }

    @GetMapping("username")
    public String getLoggedUserNam(Authentication authentication) {
        if (authentication == null) return "No auth user.";
        return authentication.getName();
    }

    @PostMapping("logout")
    public ResponseEntity<String> logout() {
        ResponseCookie cookie = jwtUtils.getCleanCookie();
        return ResponseEntity.ok()
                .header(HttpHeaders.SET_COOKIE, cookie.toString())
                .body("You have been signed out!!");
    }
}
