package com.example.demo.controller;

import org.springframework.stereotype.Controller;
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
		return "index.html";
	}
	
	@RequestMapping("/register")
	public String Register() {
		return "register";
	} 
	
	private UserService service;
	
	@PostMapping("/submitregister")
	public String Insert (User user) {
		service.Insert(user);
		return "index";
	}
	@RequestMapping("/list")
	public String GetList() {
		return "list";
	}
}
