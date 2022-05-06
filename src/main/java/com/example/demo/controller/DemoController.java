package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;

@Controller
public class DemoController {

	@GetMapping("/in")
	public String formby(Model model) {
	model.addAttribute("user" ,new User());
	return "register";
	
	//ddddd
}
	@PostMapping("/doregister")
	public String registerby(@Valid  User user, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return"register";
		}
		return "loging";
		
	}
}
