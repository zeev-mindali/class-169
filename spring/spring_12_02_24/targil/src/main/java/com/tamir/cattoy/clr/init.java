package com.tamir.cattoy.clr;

import com.tamir.cattoy.beans.Cat;
import com.tamir.cattoy.beans.Toy;
import com.tamir.cattoy.repo.CatRepo;
import com.tamir.cattoy.repo.ToyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Order(1)
public class init implements CommandLineRunner {
    @Autowired
    CatRepo catRepo;
    @Autowired
    ToyRepo toyRepo;
    @Override
    public void run(String... args) throws Exception {
        Toy t1 = new Toy("Mouse");
        Toy t2 = new Toy("Birds");
        Toy t3 = new Toy("Stick");
        Toy t4 = new Toy("Scratch");
        Toy t5 = new Toy("Legs");
        Toy t6 = new Toy("Gurmet");

        Cat cat1 = Cat.builder()
                .name("Nessi")
                .toy(t1)
                .toy(t2)
                .toy(t5)
                .weight(5.5f)
                .build();

        Cat cat2 = Cat.builder()
                .name("Cleo")
                .toy(t1)
                .toy(t5)
                .weight(4.5f)
                .build();

        Cat cat3 = Cat.builder()
                .name("David")
                .toys(Arrays.asList(t1,t2,t3,t6))
                .weight(10.0f)
                .build();

        catRepo.saveAll(Arrays.asList(cat1,cat2,cat3));
    }
}
