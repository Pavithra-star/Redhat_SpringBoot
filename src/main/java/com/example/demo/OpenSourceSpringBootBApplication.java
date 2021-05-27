package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenSourceSpringBootBApplication {

	@GetMapping("/")
	public String show() {
		return "welcome to redhot";
	}
	
	
	@GetMapping("/{input}")
	public String welocme(@PathVariable String input) {
		return "Hii " + input + " welcome to java redhot succssfully....";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(OpenSourceSpringBootBApplication.class, args);
		
		
	
	}

}
