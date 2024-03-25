package com.mindali.zeev.aop;

import com.mindali.zeev.service.AmitService;
import com.mindali.zeev.service.SMSService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    //ready instance -> service
    @Autowired
    SMSService smsService;
    @Autowired
    AmitService amitService;

    //when to invoke
    @After("@annotation(SendSMS)")
    public void sendSmsAfterGetNum(){
        smsService.sendSms("Kokoriko Tarnegol");
    }

    @Before("@annotation(HelloAmit)")
    public void printBanner(){
        amitService.sendBanner();
    }
}
