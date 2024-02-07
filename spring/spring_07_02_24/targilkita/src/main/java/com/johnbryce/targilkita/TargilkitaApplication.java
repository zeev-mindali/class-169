package com.johnbryce.targilkita;

import com.johnbryce.targilkita.annotaions.Programmer;
import com.johnbryce.targilkita.beans.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@Programmer(author = "Zeev", revision = "3.0.1", connectionType = "Z-Wave")
@SpringBootApplication
@EnableScheduling
public class TargilkitaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(TargilkitaApplication.class, args);
		Course c1 = ctx.getBean("java", Course.class);
		System.out.println(c1);

		c1.info();
		c1.info();
		c1.info();
		c1.info();
		c1.info();
		c1.info();
		c1.info();
		c1.info();
		c1.info();
		c1.info();
		c1.info();
		c1.info();
		c1.info();
		c1.info();
		c1.info();
	}

	@Bean
	public Course java(){
		Course course = new Course("Java");
		return course;
	}
}
