package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserMapper;
import com.example.demo.model.User;

@Service
public class UserService {
	@Autowired
	   private UserMapper userMapper;

	   public List<User> findAll() {
	      List<User> queryList = userMapper.findAll();
	      return queryList;
	   }


}
