package com.modinilesh.spring_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banking")
public class BalanceController {
	
	@GetMapping("/myBalance")
	public String myBalance()
	{
		return "Welcome to myBalance";
	}
}
