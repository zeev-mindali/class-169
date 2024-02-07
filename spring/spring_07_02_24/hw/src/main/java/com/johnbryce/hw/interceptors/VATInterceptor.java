package com.johnbryce.hw.interceptors;

import com.johnbryce.hw.beans.Items;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class VATInterceptor implements BeanPostProcessor {
    //@Value("2")
@Value("${vat}")
    double VAT;

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Items ){
            Items newBean = (Items)bean;
            newBean.setItemPrice(newBean.getItemPrice()*VAT);
            return newBean;
        }
        return bean;
    }
}
