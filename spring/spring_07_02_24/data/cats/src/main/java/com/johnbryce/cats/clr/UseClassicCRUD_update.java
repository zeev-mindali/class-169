package com.johnbryce.cats.clr;

import com.johnbryce.cats.beans.Cat;
import com.johnbryce.cats.repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
@Order(3)
public class UseClassicCRUD_update implements CommandLineRunner {

    @Autowired
    CatRepository catRepository;
    @Override
    public void run(String... args) throws Exception {
        Cat toUpdate = catRepository.getReferenceById(2);
        System.out.println(toUpdate);
        toUpdate.setWeight(3.0f);
        catRepository.saveAndFlush(toUpdate);
    }
}
