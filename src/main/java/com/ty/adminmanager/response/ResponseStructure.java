package com.ty.adminmanager.response;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ResponseStructure<T> {
	private T data;
	private HttpStatus httpStatus;
	
}
