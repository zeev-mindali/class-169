package com.mindali.zeev.service;

import org.springframework.stereotype.Service;

@Service
public class SMSService {
    public void sendSms(String msg){
        System.out.println("WARNING WARNING WARNING : " +msg);
    }
}
