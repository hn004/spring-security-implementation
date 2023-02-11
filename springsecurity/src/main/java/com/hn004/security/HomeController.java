package com.hn004.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@Autowired
	UserService service;
	
	@GetMapping("/home")
	public String home() {
		return "homePage";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "adminPage";
	}
	
//	@PostMapping("/home/createuser")
//	public User createUser(@RequestBody User user) {
//		return service.createUser(user);
//	}

}
;