package com.johnbryce.catbackend.clr;

import com.johnbryce.catbackend.beans.Cat;
import com.johnbryce.catbackend.repo.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
@Order(4)
public class CatList implements CommandLineRunner {

    @Autowired
    private CatRepo catRepo;
    @Override
    public void run(String... args) throws Exception {
        List<Cat> allCats = catRepo.findAll();
        allCats.forEach(System.out::println);
    }
}
