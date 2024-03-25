package com.johnbryce.catbackend.clr;

import com.johnbryce.catbackend.beans.UserRole;
import com.johnbryce.catbackend.services.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
@RequiredArgsConstructor
public class LoginTest implements CommandLineRunner {
    private final LoginService loginService;

    @Override
    public void run(String... args) throws Exception {
        String token = loginService.login("admin","admin@admin.com", UserRole.ADMIN);
        System.out.println(token);
        System.out.println("===========================================");
        //let's hack the system :)
        try {
            String tokenBad = loginService.login("yuri", "the hurt", UserRole.GUEST);
            System.out.println(tokenBad);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
