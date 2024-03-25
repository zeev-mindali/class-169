package com.johnbryce.catbackend.clr;

import com.johnbryce.catbackend.beans.Cat;
import com.johnbryce.catbackend.services.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
@Order(1)
public class CatServiceTest implements CommandLineRunner {
    @Autowired
    CatService catService;
    @Override
    public void run(String... args) throws Exception {
        catService.addCat(new Cat().builder()
                        .id(0)
                        .name("kia")
                        .weight(100f)
                        .age(3)
                .build());


    }
}
