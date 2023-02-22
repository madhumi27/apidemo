package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class name {
	@GetMapping("showname")
	public String nameget() {
		String stdName="IamNEo";
		return "Welcome"+stdName+"!";
	}

}


