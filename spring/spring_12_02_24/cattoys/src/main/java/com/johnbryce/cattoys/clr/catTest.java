package com.johnbryce.cattoys.clr;

import com.johnbryce.cattoys.beans.Cat;
import com.johnbryce.cattoys.beans.Color;
import com.johnbryce.cattoys.repos.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
@Order(1)
public class catTest implements CommandLineRunner {
    @Autowired
    CatRepo catRepo;

    @Override
    public void run(String... args) throws Exception {
        Cat cat = Cat.builder()
                .name("David")
                .weight(10.0f)
                .color(Color.BLACK)
                .build();

        catRepo.save(cat);
    }
}
