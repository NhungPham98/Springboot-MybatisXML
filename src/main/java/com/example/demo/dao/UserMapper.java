package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.User;


public interface UserMapper {
	
	public List<User> findAll();

}
