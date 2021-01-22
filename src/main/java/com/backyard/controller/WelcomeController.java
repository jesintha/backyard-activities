package com.backyard.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.backyard.beans.WelcomeBean;

@RestController
public class WelcomeController {
	
	@Value("${backyard.city}")
	private String city;
	
	@GetMapping ("/welcome")
	public String welcome() {
		return "Welcome to Backyard Rulz in "+ city;
	}
	
	@GetMapping ("/welcome/{username}")
	public WelcomeBean welcome1(@PathVariable String username) {
		return WelcomeBean.builder().message("Welcome "+ username +"! to Backyard Rulz").build();
	}

}
