package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;

@Controller
public class DemoController {
@Autowired
UserMapper userMapper;
	@GetMapping("/in")
	public String formby(Model model) {
	model.addAttribute("user" ,new User());
	return "register";
	
	
}
	@PostMapping("/doregister")
	public String registerby(@Valid  User user, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return"register";
		}
		userMapper.doinsert(user);
		return "loging";
		
	}
}
