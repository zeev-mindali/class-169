package com.mindali.zeev.service;

import com.mindali.zeev.util.Banner;
import org.springframework.stereotype.Service;

@Service
public class AmitService {
    public void sendBanner(){
        System.out.println(Banner.AmitBanner);
    }
}
