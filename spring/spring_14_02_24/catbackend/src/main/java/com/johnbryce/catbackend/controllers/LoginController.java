package com.johnbryce.catbackend.controllers;

import com.johnbryce.catbackend.beans.Credentials;
import com.johnbryce.catbackend.beans.UserRole;
import com.johnbryce.catbackend.services.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.LoginException;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor

public class LoginController {
    private final LoginService loginService;
    @PostMapping("/login")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String login(@RequestBody Credentials userCredentials, UserRole role) throws LoginException {
        return loginService.login(userCredentials.getUserName(), userCredentials.getUserPass(), role);
    }


}
