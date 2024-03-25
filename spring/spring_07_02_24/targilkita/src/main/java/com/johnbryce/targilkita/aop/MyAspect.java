package com.johnbryce.targilkita.aop;

import com.johnbryce.targilkita.annotaions.Programmer;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Programmer(author = "Shani", revision = "1.0.1", connectionType = "ZigBee")
@Component
@Aspect
public class MyAspect {
    @After("@annotation(LogThisMessage)")
    public void printLog(){
        System.out.println(LocalDateTime.now()+">new info");
    }
}
