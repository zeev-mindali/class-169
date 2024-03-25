package com.johnbryce.catbackend.clr;

import com.johnbryce.catbackend.beans.Cat;
import com.johnbryce.catbackend.repo.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;

//@Component
@Order(3)
public class DeleteCat implements CommandLineRunner {
    @Autowired
    CatRepo catRepo;

    @Override
    public void run(String... args) throws Exception {
        Optional<Cat> catToDelete = catRepo.findById(3);
        catToDelete.ifPresent((cat)->{
            //remove relations but keep the toy
            cat.setToys(null);
            catRepo.deleteById(3);
        });
        //delete cat by id

    }
}
