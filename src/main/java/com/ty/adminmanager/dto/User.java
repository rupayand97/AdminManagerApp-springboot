package com.ty.adminmanager.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String userId;
	private String userName;
	@Column(unique = true)
	private String email;
	private String password;
	@Column(unique = true)
	private Long phone;
	private String userType;
	private Boolean accAct; //account activation: true/false
}
