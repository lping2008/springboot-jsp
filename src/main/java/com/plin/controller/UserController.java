package com.plin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plin.domain.User;
import com.plin.service.IUserService;


@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;

	@RequestMapping("/user/save")
	public String save(String name){
		User user = new User(name);
		userService.save(user);
		System.out.println(user.getName()+"  Consle saveSeccefully");
		return "saveSuccesful";
	}
	
	@RequestMapping("/user/get")
	public User get(Long id){
		User user = userService.get(id);
		return user;
	}
}
