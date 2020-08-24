package com.apex.controllers;

import javax.ws.rs.Path;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String getName() {
		return "Hello";
	}
	
	@GetMapping("/{name}")
	public String getName(@PathVariable String name) {
		return "Hello " + name;
	}

}
