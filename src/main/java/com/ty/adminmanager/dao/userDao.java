package com.ty.adminmanager.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.adminmanager.dto.User;
import com.ty.adminmanager.repository.UserRepository;

@Repository
public class userDao {

	@Autowired
	private static UserRepository userRepository;

	public static User saveUser(User user) {
		return userRepository.save(user);
	}
	
	
}
