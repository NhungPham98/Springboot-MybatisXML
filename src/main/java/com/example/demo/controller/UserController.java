package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	private UserService service;
	
	@RequestMapping("/submitregister")
	public String Insert (User user) {
		service.insert(user);
		return "list";
	}
	
	@RequestMapping("/edit/{id}")
	public String Edit(@PathVariable(value = "id") int id, Model model) {
		User user = new User();
		user = service.getById(id);
		model.addAttribute("user", user);
		return "userEdit";
	}
	
	@PostMapping("/update")
	public String UpdateUser(User user,@PathVariable(value = "id") int id) {
		service.update(user);
		return "userList";
	}

	@RequestMapping("/delete/{id}")
	public String DeleteUser(@PathVariable(value = "id") int id) {
		service.delete(id);
		return "userList";
	}
	
	@RequestMapping("/list")
	public String GetList() {
		return "list";
	}
}
