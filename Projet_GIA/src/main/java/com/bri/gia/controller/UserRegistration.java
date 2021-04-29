package com.bri.gia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bri.gia.model.User;


@Controller
public class UserRegistration {
	
	@GetMapping("/registration")
	public String showRegistrationForm(Model model) {
		User user= new User();
		return"registration";
	}

	
	@PostMapping("/registration")
    public String registration(@ModelAttribute("user")User user) {
     
		return"registrationSuccess";
	}
	
}
