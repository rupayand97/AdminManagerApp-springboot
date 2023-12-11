package com.ty.adminmanager.service;


import org.springframework.http.HttpStatus;

import com.ty.adminmanager.dao.userDao;
import com.ty.adminmanager.dto.User;
import com.ty.adminmanager.response.ResponseStructure;

@org.springframework.stereotype.Service
public class Service {

	public static ResponseStructure<?> save(User user) {
		User dbSaveUser;
		try {
			dbSaveUser = userDao.saveUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ResponseStructure<User> responseStructure = new ResponseStructure<>();
		responseStructure.setData(dbSaveUser);
		responseStructure.setHttpStatus(HttpStatus.CREATED);
		
		return responseStructure;
	}

}
