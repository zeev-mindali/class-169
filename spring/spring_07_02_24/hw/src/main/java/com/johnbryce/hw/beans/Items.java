package com.johnbryce.hw.beans;

import com.johnbryce.hw.AOP.CreditWarning;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Qualifier("items")
public class Items {
    //@Value("${defaultName}")
    String itemName;
    //@Value("${defaultPrice}")
    Double itemPrice=0.00;
    //@Value("${defaultCredit}")
    String CreditCard;


    @CreditWarning
    public String getCreditCard() {
        return CreditCard;
    }
}
