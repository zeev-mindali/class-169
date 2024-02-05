package com.mindali.zeev;

import com.mindali.zeev.beans.MyPrototype;
import com.mindali.zeev.beans.MySingleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration + @ComponentScan + @EnableAutoConfiguration
public class ZeevApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ZeevApplication.class, args);
		MyPrototype p1 = ctx.getBean("myPrototype", MyPrototype.class);
		MyPrototype p2 = ctx.getBean("proto6", MyPrototype.class);

		MySingleton s1 = ctx.getBean("mySingleton", MySingleton.class);
		MySingleton s2 = ctx.getBean("single6", MySingleton.class);
		MySingleton s3 = ctx.getBean("mySingleton", MySingleton.class);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println("===========================================");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
