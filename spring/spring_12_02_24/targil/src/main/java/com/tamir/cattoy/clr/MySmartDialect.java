package com.tamir.cattoy.clr;

import com.tamir.cattoy.beans.Cat;
import com.tamir.cattoy.repo.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(3)
public class MySmartDialect implements CommandLineRunner {
    @Autowired
    CatRepo catRepo;

    @Override
    public void run(String... args) throws Exception {
//        List<Cat> allCats = catRepo.getByNameAndWeight("Nessi",5.5f);
//        allCats.forEach(System.out::println);
    }
}
