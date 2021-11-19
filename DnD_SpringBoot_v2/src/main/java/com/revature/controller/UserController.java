package com.revature.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.revature.domain.User;
import com.revature.service.UserService;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@RestController @RequiredArgsConstructor 
@RequestMapping("/")
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public  ResponseEntity<List<User>>getUsers(){
		return ResponseEntity.ok().body(userService.getUsers());
	}
	
	@PostMapping("/users/save")
	public  ResponseEntity<User> saveUsers(@RequestBody User user){
		URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/user/save").toUriString());
		return ResponseEntity.created(uri).body(userService.saveUser(user));
	}
	
	@PostMapping("/role/save")
	public  ResponseEntity<?> saveRoleToUser(@RequestBody RoleToUserForm form){
		userService.addRoleToUser(form.getUsername(),form.getRoleName());
		return ResponseEntity.ok().build();
	}
}


@Data
class RoleToUserForm {
	
	private String username;
	private String roleName;
}

