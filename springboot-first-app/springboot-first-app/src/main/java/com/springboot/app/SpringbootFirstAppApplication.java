package com.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class SpringbootFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstAppApplication.class, args);
		System.out.println("@@@@@@ Application Started @@@@@@");
	}

	@RequestMapping("/")
	public String printStartupMessage() {

		 return "Wow Apllication is started";
		 return "trying to run this application as a container";
	
	}
}	
