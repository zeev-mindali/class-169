package com.johnbryce.cats.clr;

import com.johnbryce.cats.beans.Cat;
import com.johnbryce.cats.beans.Color;
import com.johnbryce.cats.repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
@Order(1)
public class UseClassicCrud50 implements CommandLineRunner {
    @Autowired
    private CatRepository catRepository;
    @Override
    public void run(String... args) throws Exception {
        Cat c1 = Cat.builder()
                .name("Mitzi")
                .color(Color.WHITE)
                .weight(4.5f)
                .build();

        Cat c2 = Cat.builder()
                .name("David")
                .color(Color.BLACK)
                .weight(6.0f)
                .build();

        Cat c3 = Cat.builder()
                .name("Kut")
                .color(Color.BROWN)
                .weight(10f)
                .build();

        catRepository.save(c1);
        catRepository.save(c2);
        catRepository.save(c3);

        System.out.println("Class-169");
    }
}
