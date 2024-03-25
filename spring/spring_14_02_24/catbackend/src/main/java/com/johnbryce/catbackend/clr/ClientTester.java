package com.johnbryce.catbackend.clr;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClientTester implements CommandLineRunner {
    private final ApplicationContext context;
    @Override
    public void run(String... args) throws Exception {

    }
}
