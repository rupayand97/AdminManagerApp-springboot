package com.ty.adminmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.adminmanager.dto.User;
import com.ty.adminmanager.response.ResponseStructure;
import com.ty.adminmanager.service.Service;

@RestController
public class Controller {

	@Autowired
	private Service service; 
	
	public ResponseEntity<?> save(@RequestBody User user){
		
		ResponseStructure<?> responseStructure = Service.save(user);
		
		return new ResponseEntity<>(responseStructure, responseStructure.getHttpStatus());
		
	}
}
