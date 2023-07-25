package com.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/home")
public class Second {
	
	
	@RequestMapping(value = "/get" ,method =RequestMethod.GET)
	//@GetMapping(value = "/get")
	public String Gethome() {
		return "First";
	}
}

