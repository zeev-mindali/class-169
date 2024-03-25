package com.js.msgateway.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("fallback")
public class FallbackController {

    @GetMapping("serviceA")
    public String serviceA(){
        return "A Resources is not available at all";
    }

    @GetMapping("serviceB")
    public String serviceB(){
        return "B Resources is not available at all";
    }
}
