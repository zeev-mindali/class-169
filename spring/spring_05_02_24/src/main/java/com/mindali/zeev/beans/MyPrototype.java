package com.mindali.zeev.beans;

import com.mindali.zeev.aop.HelloAmit;
import com.mindali.zeev.aop.SendSMS;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Data;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Data
public class MyPrototype {
    private int num=(int)(Math.random()*101);
    public MyPrototype(){
        System.out.println(this.getClass().getSimpleName()+" was invoked");
    }

    @PostConstruct
    public void hiush(){
        System.out.println("Hiush");
    }

    @PreDestroy
    public void beyush(){
        System.out.println("Bayush");
    }


    @SendSMS
    public int getNum(){return num;}

    @HelloAmit
    public void sayHI(){
        System.out.println("Hi");
    }
}
