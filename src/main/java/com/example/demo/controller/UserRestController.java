package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/getlist")
	public List<User> GetUserList(){
		
		return userService.findAll();
		
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView Edit(@PathVariable(value = "id") int id) {
		
		User user = userService.getById(id);
		ModelAndView mav = new ModelAndView("userEdit");
		mav.addObject("user", user);
		return mav;
	}
	
}
