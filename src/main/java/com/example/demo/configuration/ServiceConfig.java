package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.user.UserService;

@Configuration
public class ServiceConfig {
	@Bean
	public UserService userService() {
		return new UserService();
	}
}
