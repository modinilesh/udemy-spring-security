package com.modinilesh.spring_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestcontroller {
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome to Spring security demo project";
	}
}
