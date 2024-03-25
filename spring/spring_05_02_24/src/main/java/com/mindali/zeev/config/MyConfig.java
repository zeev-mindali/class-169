package com.mindali.zeev.config;

import com.mindali.zeev.beans.MyPrototype;
import com.mindali.zeev.beans.MySingleton;
import com.mindali.zeev.beans.Student;
import com.mindali.zeev.beans.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
    @Bean
    @Scope("prototype")
    public MyPrototype proto6(){
        MyPrototype myPrototype = new MyPrototype();
        myPrototype.setNum(55555); // dependency injection
        return myPrototype;
    }

    @Bean
    @Lazy
    public MySingleton single6(){
        MySingleton mySingleton = new MySingleton();
        mySingleton.setNum(42);
        return mySingleton;
    }

    @Bean
    @Scope("prototype")
    public Student tim(){
        Student student = new Student();
        student.setName("Tim the MAAAALLLLLLLLLLLLLLLLLLLLLLLLLLLLLFFFFFF");
        return student;
    }

    @Bean
    @Lazy
    public Teacher zeev(){
        Teacher teacher=new Teacher();
        teacher.setName("Zeev");
        return teacher;
    }
}
