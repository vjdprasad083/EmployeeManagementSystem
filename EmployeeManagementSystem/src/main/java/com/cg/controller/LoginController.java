package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.User;
import com.cg.services.LoginService;

@RestController
@RequestMapping("/api")
public class LoginController {
	@Autowired
	LoginService Repo;
	@RequestMapping("/validateUser")
	public User validateUser(@RequestBody User userId) {
	User user = Repo.validateUser(userId);
	return user;
	}

}