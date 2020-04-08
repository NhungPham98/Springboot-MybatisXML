package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
@Controller
public class UserController {
	
	public UserController() {
		System.out.print("test controller");
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/register")
	public String Register() {
		return "register";
	} 
	
	@Autowired
	private UserService service;
	
	@RequestMapping("/submitregister")
	public String Insert (User user) {
		service.insert(user);
		return "list";
	}
	
	@PostMapping("/update")
	public String UpdateUser(User user) {
		service.update(user);
		return "list";
	}

	@RequestMapping("/delete/{id}")
	public String DeleteUser(@PathVariable(value = "id") int id) {
		service.delete(id);
		return "list";
	}
	
	@RequestMapping("/list")
	public String GetList() {
		return "list";
	}
}
