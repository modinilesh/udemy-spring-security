package com.modinilesh.spring_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banking")
public class AccountController {
	
	@GetMapping("/myAccount")
	public String myAccount()
	{
		return "Welcome to Spring security demo project";
	}
}
