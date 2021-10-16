package com.revature.example.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.revature.example.repository.UserRepository;

@SpringBootApplication
@ComponentScan(basePackages = {"com.revature.example.*"})
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@EntityScan("com.revature.example.*")
public class ExampleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleProjectApplication.class, args);
	}

}
