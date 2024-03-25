package com.jb.msserviceb.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @Value("${spring.cloud.consul.discovery.instanceId}")
    private String instId;

    @GetMapping("service/b")
    public String whoAmI(){
        return "This is "+ instId;
    }

}
