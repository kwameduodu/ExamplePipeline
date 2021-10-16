package com.revature.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.example.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	static Optional<User> findByUserName(String userName) {
		
		return null;
	}
	 
}