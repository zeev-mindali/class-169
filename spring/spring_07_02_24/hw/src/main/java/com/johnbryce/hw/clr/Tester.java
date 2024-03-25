package com.johnbryce.hw.clr;

import com.johnbryce.hw.HwApplication;
import com.johnbryce.hw.beans.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Tester implements CommandLineRunner {
    @Autowired
    ApplicationContext ctx;
    @Override
    public void run(String... args) throws Exception {

//        Items pentalon = Items.builder()
//                .itemName("Pentalon")
//                .itemPrice(100.00)
//                .CreditCard("1234-1234")
//                .build();
//
//        Items hawaiShirt = Items.builder()
//                .itemName("Shirt")
//                .itemPrice(49.90)
//                .CreditCard("1234-1234")
//                .build();
        Items pentalon = ctx.getBean("pentalon", Items.class);
        Items hawaiShirt = ctx.getBean("shirt", Items.class);
        System.out.println(pentalon);
        System.out.println(hawaiShirt);

        System.out.println(pentalon.getCreditCard());

        Items shani = ctx.getBean("items",Items.class);

        System.out.println(shani);
        System.out.println(shani.getCreditCard());
    }
}
