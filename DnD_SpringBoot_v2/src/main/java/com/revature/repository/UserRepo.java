package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
	User findByUsername(String username);

}
