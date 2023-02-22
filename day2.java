package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class day2 {
	@Value("${str}")
	private String newvar;
	@GetMapping("showday2")
	public String welcme() {
		return "hy"+newvar+"my day2 project";
	}
}
