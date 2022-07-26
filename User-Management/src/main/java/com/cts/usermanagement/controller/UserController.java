package com.cts.usermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.usermanagement.model.AppUser;
import com.cts.usermanagement.service.UserService;


@RestController
//This annotation is used at the class level and allows the class to handle the requests made by the client
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping("/MBooking")
	public String welcome() {
    	return "UserManagement Service Is READY !!";
	}
	
    @PostMapping("/user")
	public AppUser registerUser(@RequestBody AppUser appUser) {
    	
    	return userService.registerUser(appUser);
	}
	
	@GetMapping("/user")
	public List<AppUser> getUsers(){
		return userService.getUsers();		
	}
	
	@GetMapping("/user/{id}")
	public AppUser getUserById(@PathVariable("id") Integer id) {
		
		return userService.getUserById(id);
	}
	
}
