package com.johnbryce.hw;

import com.johnbryce.hw.beans.Items;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HwApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(HwApplication.class, args);

	}

}
