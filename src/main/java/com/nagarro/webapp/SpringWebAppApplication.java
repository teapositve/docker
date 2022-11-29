package com.nagarro.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringWebAppApplication {

	@GetMapping("/message")
	public String message(){
		return "Welcome to Spring Web App !!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringWebAppApplication.class, args);
	}

}
