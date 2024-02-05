package com.mindali.zeev.config;

import com.mindali.zeev.beans.MyPrototype;
import com.mindali.zeev.beans.MySingleton;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
    @Bean
    @Scope("prototype")
    public MyPrototype proto6(){
        MyPrototype myPrototype = new MyPrototype();
        myPrototype.setNum(5); // dependency injection
        return myPrototype;
    }

    @Bean
    @Lazy
    public MySingleton single6(){
        MySingleton mySingleton = new MySingleton();
        mySingleton.setNum(42);
        return mySingleton;
    }
}
