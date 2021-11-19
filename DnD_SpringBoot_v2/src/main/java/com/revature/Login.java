package com.revature;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.revature.domain.Role;
import com.revature.domain.User;
import com.revature.repository.UserRepo;
import com.revature.service.UserService;

@SpringBootApplication
@ComponentScan(basePackages = "com.revature.*")
@EntityScan(basePackages = "com.revature.*")
@EnableJpaRepositories(basePackages = "com.revature.*")
public class Login {

	public static void main(String[] args) {
		SpringApplication.run(Login.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
}
