package com.johnbryce.hw.AOP;

import com.johnbryce.hw.utils.Banner;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CreditCardAspect {
    @Before("@annotation(CreditWarning)")
    public void ShowCreditCardWarning(){
        System.out.println(Banner.Warning);
    }
}
