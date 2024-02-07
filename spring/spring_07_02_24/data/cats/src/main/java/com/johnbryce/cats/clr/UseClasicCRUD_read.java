package com.johnbryce.cats.clr;

import com.johnbryce.cats.beans.Cat;
import com.johnbryce.cats.repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(2)
public class UseClasicCRUD_read implements CommandLineRunner {
    @Autowired
    CatRepository catRepository;
    @Override
    public void run(String... args) throws Exception {
        //select * from cats
        //catRepository.findAll().forEach(System.out::println);
        System.out.println("total cats:"+catRepository.count());
        List<Cat> allMitzi = catRepository.findByName("Mitzi");
        allMitzi.forEach(System.out::println);
        System.out.println("Average weight:"+catRepository.avg());
    }
}
