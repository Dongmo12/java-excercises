package com.maven.tech.HelloWorldApps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping("/helloWorld")
	private String helloWorld() {
		return "Hello World guys!!";
	}
	
	@GetMapping("/welcome")
	private String welcome() {
		return "Welcome to our program!!";
	}
}
