package com.elearning.auth.controller;

import com.elearning.auth.dto.AuthDTO;
import com.elearning.auth.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/auth")
@Slf4j
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping("/signup")
    public AuthDTO.AuthResponse signup(@RequestBody AuthDTO.SignupRequest request){
        log.info(""+request);
        return authService.signup(request);
    }

    @PostMapping("/login")
    public AuthDTO.AuthResponse login(@RequestBody AuthDTO.LoginRequest request){
        return authService.login(request);
    }


}
