package com.ty.adminmanager.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	public ResponseEntity<?> handleUserNotFoundException (UserNotFoundException exception, HttpServletRequest request){
		ApiError apiError = new ApiError();
		apiError.setLocalDateTime(LocalDateTime.now());
		apiError.setEndPointPath(request.getRequestURI());
		apiError.setHttpStatus(HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(apiError, apiError.getHttpStatus());
	}
	
}
