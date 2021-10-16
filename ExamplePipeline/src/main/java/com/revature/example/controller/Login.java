package com.revature.example.controller;

import org.springframework.core.Ordered;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Login {

	@GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
    
    
    public void addViewControllers(ViewControllerRegistry registry) {
       
        registry.addViewController("/savePassword").setViewName("static/pages/savePassword.html");
        registry.addViewController("/login").setViewName("src/main/resources/templates/login.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
}
    
}
