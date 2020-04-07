package com.example.demo.dao;

import java.util.List;


import com.example.demo.model.User;


public interface UserMapper {
	
	public List<User> findAll();
	
	public void insert(User user);
	
	public void delete (Integer id);
	
	public void update(User user);
	
	public User getById(Integer id);
	
}
