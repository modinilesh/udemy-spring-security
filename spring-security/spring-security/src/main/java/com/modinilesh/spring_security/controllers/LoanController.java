package com.modinilesh.spring_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banking")
public class LoanController {
	
	@GetMapping("/myLoans")
	public String myLoans()
	{
		return "Welcome to myLoans";
	}
}
