package com.johnbryce.catbackend.clr;

import com.johnbryce.catbackend.beans.Cat;
import com.johnbryce.catbackend.repo.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;

//@Component
@Order(2)
public class UpdateCat implements CommandLineRunner {
    @Autowired
    CatRepo catRepo;
    @Override
    public void run(String... args) throws Exception {
        //get cat by id
        Optional<Cat> updateCat = catRepo.findById(3);
        //print cat
        updateCat.ifPresent(System.out::println);
        //update cat
        updateCat.ifPresent((cat)->{
            //set name
            cat.setName("David the ars");
            //save and make it now (flush)
            catRepo.saveAndFlush(cat);
        });
    }
}
