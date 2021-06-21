package com.cts.pss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // Auto Discovery
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
