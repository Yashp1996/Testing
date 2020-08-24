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
	
	
	@GetMapping("/address")
	public String getAddress() {
		return "San jose CA";
	}
	
<<<<<<< HEAD
	
	@GetMapping("/users")
	public String getAddress() {
		return "yash and Druv";

>>>>>>> c12687b5f6748c9e56cab216cf1d21385273a880
	}
	
	@GetMapping("/user")
	public String getAddress() {
		return "yash and Druv";
	}

}
