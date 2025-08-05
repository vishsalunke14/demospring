package org.vishal.myfirstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyfirstprojectApplication {

	public static void main(String[] args) {
		// System.out.println("Hello World");
		System.out.println(MyController.myMethod());
		SpringApplication.run(MyfirstprojectApplication.class, args);
	}

}
