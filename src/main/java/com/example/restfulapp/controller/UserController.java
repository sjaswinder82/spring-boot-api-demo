package com.example.restfulapp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
	
	@GetMapping
	public String getUser() {
		return "User";
	}
	
	@PostMapping
	public String createUser() {
		return "user created";
	}
	
	@PutMapping
	public String updateUser() {
		return "Updated user";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "user deleted";
	}
}
