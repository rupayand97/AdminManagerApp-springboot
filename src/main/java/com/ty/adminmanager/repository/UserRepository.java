package com.ty.adminmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.adminmanager.dto.User;

public interface UserRepository extends JpaRepository<User, Integer>{


//		return null;
}
