package com.mindali.zeev;

import com.mindali.zeev.beans.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class clr implements CommandLineRunner {
    @Autowired
    ApplicationContext ctx;
    @Override
    public void run(String... args) throws Exception {
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);
    }
}
