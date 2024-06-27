package com.modinilesh.spring_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banking")
public class NoticeController {
	
	@GetMapping("/notices")
	public String notices()
	{
		return "Welcome to notices";
	}
}
