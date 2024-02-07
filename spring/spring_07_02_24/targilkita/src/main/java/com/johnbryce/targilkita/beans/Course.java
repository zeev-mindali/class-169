package com.johnbryce.targilkita.beans;

import com.johnbryce.targilkita.aop.LogThisMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private String subject;

    @LogThisMessage
    public void info(){
        System.out.println("Course information: "+subject);
    }
}
