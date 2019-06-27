package com.raven.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/client")
public class HomeController {

	@GetMapping({"/home", "", "/"})
	public String home() {
		
		return "index";
	}
	
	@GetMapping({"/persona", "", "/"})
	public String persona() {
		
		return "contact";
	}
	
	@GetMapping({"/muestra", "", "/"})
	public String muestra() {
		
		return "inner";
	}
	
}
