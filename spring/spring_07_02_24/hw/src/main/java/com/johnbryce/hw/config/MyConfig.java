package com.johnbryce.hw.config;

import com.johnbryce.hw.beans.Items;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {

    @Bean
    @Scope("prototype")
    @Qualifier("pentalon")
    public Items pentalon(){
        Items newItem = Items.builder()
                .itemName("Pentalon")
                .itemPrice(99.99)
                .CreditCard("1234-1234")
                .build();

        return newItem;
    }

    @Bean
    @Scope("prototype")
    @Qualifier("shirt")
    public Items shirt(){
        Items newItem = Items.builder()
                .itemName("Shirt")
                .itemPrice(9.99)
                .CreditCard("")
                .build();
        return newItem;
    }
}
