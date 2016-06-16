package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	@RequestMapping(value={"/{userId}/", "/home/{userId}/", "/dashboard/{userId}/"}, method=RequestMethod.GET)
	public String welcome(@PathVariable("userId") int id, @RequestParam("username") String username){
		System.out.println("ID: " + id + " Username: " + username);
		return "/WEB-INF/jsp/index.jsp";
	}
}
