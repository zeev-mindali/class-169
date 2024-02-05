package com.mindali.zeev.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Data
public class MyComposed {
    @Autowired
    @Qualifier("proto6")
    private MyPrototype myPrototype;
    @Autowired
    private MySingleton mySingleton;


}
