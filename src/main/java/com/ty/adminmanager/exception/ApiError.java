package com.ty.adminmanager.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ApiError {
	private LocalDateTime localDateTime;
	private String message;
	private String endPointPath;
	private HttpStatus httpStatus;
}
