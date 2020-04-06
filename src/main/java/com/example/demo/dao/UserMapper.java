package com.example.demo.dao;

import java.util.List;


import com.example.demo.model.User;


public interface UserMapper {
	
	public List<User> findAll();
	
	public Void Insert(User user);

}
