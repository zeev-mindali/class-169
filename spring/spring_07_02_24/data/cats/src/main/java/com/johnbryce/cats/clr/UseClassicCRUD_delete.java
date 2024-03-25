package com.johnbryce.cats.clr;

import com.johnbryce.cats.repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
@Order(4)
public class UseClassicCRUD_delete implements CommandLineRunner {
    @Autowired
    CatRepository catRepository;
    @Override
    public void run(String... args) throws Exception {
        catRepository.deleteById(2);
    }
}
