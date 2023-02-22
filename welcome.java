package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class welcome {
	@GetMapping("show")
	public String wel() {
		return "WElcome Spring boot";
	}
}
