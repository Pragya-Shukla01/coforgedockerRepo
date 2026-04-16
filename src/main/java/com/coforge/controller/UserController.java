package com.coforge.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.User;
import com.coforge.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private static final Logger logger=LoggerFactory.getLogger(UserController.class);
	
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public List<User> getAllUser(){
		logger.info("Fetching All users Information");
		return userService.getAllUser();
	}
	@PostMapping("/")
	public User addUser(@RequestBody User user) {
		logger.info("Saving user info{}",user);
		return userService.addUser(user);
	}

	@GetMapping("/id/{userId}")
	public User getByUserId(@PathVariable("userId") long userId) {
		logger.info("Fetching user by user by user id {}",userId);
	    return userService.getByUserId(userId);
	}

}
