package com.revature.service;

import java.util.List;

import com.revature.domain.Role;
import com.revature.domain.User;


public interface UserService {

	User saveUser (User user);
	Role saveRole (Role role);
	void addRoleToUser(String username, String roleName);
	User getUser(String username);
	List<User>getUsers();
	
}
