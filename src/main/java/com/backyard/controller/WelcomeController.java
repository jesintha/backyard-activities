package com.backyard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.backyard.beans.WelcomeBean;

@RestController
public class WelcomeController {
	
	@GetMapping ("/welcome")
	public String welcome() {
		return "Welcome to Backyard Rulz";
	}
	
	@GetMapping ("/welcome/{username}")
	public WelcomeBean welcome1(@PathVariable String username) {
		return WelcomeBean.builder().message("Welcome "+ username +"! to Backyard Rulz").build();
	}

}
