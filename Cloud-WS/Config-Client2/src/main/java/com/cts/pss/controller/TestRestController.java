package com.cts.pss.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RefreshScope
public class TestRestController {
	
	@Value("${role.name}")
	private String roleName; 
	
	@GetMapping
	public String f1() {
		return "Hello, now your role is "+roleName;
	}

}
