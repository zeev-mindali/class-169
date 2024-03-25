package com.mindali.zeev.interceptors;

import com.mindali.zeev.beans.MyPrototype;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyInterceptor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //System.out.println(beanName);
        if (bean instanceof MyPrototype && beanName.equals("myPrototype")){
            int val = ((MyPrototype)bean).getNum();
            if (val %2 ==1){
                System.out.println("Val found: "+val+" which is odd number");
                ((MyPrototype)bean).setNum(val+1);
                System.out.println("Roni don't worry, i fixed it: new val :"+(val+1)+" which is even number");
                return bean;
            } else {
                System.out.println("Every thing is OK!!!! got:"+val);
            }
        }
        return bean;
    }


}
