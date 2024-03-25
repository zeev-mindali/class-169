package com.johnbryce.cattoys.clr;

import com.johnbryce.cattoys.beans.Cat;
import com.johnbryce.cattoys.beans.Toy;
import com.johnbryce.cattoys.repos.CatRepo;
import com.johnbryce.cattoys.repos.ToyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
@Order(1)
public class Init implements CommandLineRunner {
    @Autowired
    CatRepo catRepo;

    @Autowired
    ToyRepo toyRepo;

    @Override
    public void run(String... args) throws Exception {
        Toy t1 = new Toy("Ball");
        Toy t2 = new Toy("Bird");
        Toy t3 = new Toy("Laser");
        Toy t4 = new Toy("Mouse");

        Cat c1 = Cat.builder()
                .name("Nessi")
                .weight(5.5)
                .toys(Arrays.asList(t2,t4,t3))
                .build();

        Cat c2 = Cat.builder()
                .name("Cleo")
                .weight(4.5)
                .toy(t1)
                .toy(t2)
                .toy(t3)
                .toy(t4)
                .build();


        catRepo.saveAll(Arrays.asList(c1,c2));
    }
}
