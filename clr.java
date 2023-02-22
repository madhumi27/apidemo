package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class clr {
	@GetMapping("showclr")
	public String favclrget() {
		String clr="Blue";
		return "My favourite color is "+clr;
	}

}




