package com.johnbryce.catbackend.clr;

import com.johnbryce.catbackend.beans.Cat;
import com.johnbryce.catbackend.beans.Toy;
import com.johnbryce.catbackend.repo.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Order(1)
public class CreateCats implements CommandLineRunner {
    @Autowired
    private CatRepo catRepo;
    @Override
    public void run(String... args) throws Exception {
        //add cat
        Cat cat1 = Cat.builder()
                .name("Nessi")
                .weight(10.0f)
                .toy(new Toy("bird"))
                .toy(new Toy("Legs"))
                .build();
        Cat cat2 = Cat.builder()
                .name("Cleo")
                .weight(7.0f)
                .toy(new Toy("mouse"))
                .build();

        Cat cat3 = Cat.builder()
                .name("David")
                .weight(13.0f)
                .toy(new Toy("Gormet"))
                .build();

        catRepo.saveAll(Arrays.asList(cat1,cat2,cat3));


    }
}
