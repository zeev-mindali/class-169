package com.mindali.zeev;

import com.mindali.zeev.beans.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@Configuration + @ComponentScan + @EnableAutoConfiguration
public class ZeevApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ZeevApplication.class, args);
		MyPrototype p1 = ctx.getBean("myPrototype", MyPrototype.class);
//		MyPrototype p2 = ctx.getBean("proto6", MyPrototype.class);
//
//		MySingleton s1 = ctx.getBean("mySingleton", MySingleton.class);
//		MySingleton s2 = ctx.getBean("single6", MySingleton.class);
//		MySingleton s3 = ctx.getBean("mySingleton", MySingleton.class);
//
//		Teacher teacher = ctx.getBean("zeev",Teacher.class);
//		Student student = ctx.getBean("tim", Student.class);
//
		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println("===========================================");
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(teacher);
//		System.out.println(student);

//		MyComposed c1 = ctx.getBean(MyComposed.class);
		System.out.println(p1.getNum());
		p1.sayHI();
	}

}
