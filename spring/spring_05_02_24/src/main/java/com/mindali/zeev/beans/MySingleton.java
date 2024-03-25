package com.mindali.zeev.beans;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Data
public class MySingleton {
    private int num = (int)(Math.random()*101);

    public MySingleton(){
        System.out.println(this.getClass().getSimpleName()+" was invoked");
    }
}
