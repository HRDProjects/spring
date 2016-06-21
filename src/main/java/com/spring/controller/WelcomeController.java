package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcome(){
		return "index";
	}
	
	@RequestMapping(value="/user/{username}", method=RequestMethod.GET)
	public String welcome(@PathVariable("username") String username, Model model){
		model.addAttribute("username", username);
		return "user";
	}
}
