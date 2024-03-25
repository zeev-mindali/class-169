package com.johnbryce.catbackend.clr;

import com.johnbryce.catbackend.beans.Cat;
import com.johnbryce.catbackend.repo.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
@Order(5)
public class SmartDialect implements CommandLineRunner {
    @Autowired
    CatRepo catRepo;

    @Override
    public void run(String... args) throws Exception {
        //List<Cat> catByWeight = catRepo.findAllByOrderByWeightDesc();
        //catByWeight.forEach(System.out::println);
        List<Cat> catStartWith = catRepo.findByNameStartingWith("Ne");
        catStartWith.forEach(System.out::println);
    }
}
