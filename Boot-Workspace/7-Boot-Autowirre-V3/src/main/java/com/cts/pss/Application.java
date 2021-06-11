package com.cts.pss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.pss.dao.PassengerServiceImpl;

@SpringBootApplication
public class Application {
	
	

	public static void main(String[] args) {
		
		ApplicationContext ac = SpringApplication.run(Application.class, args);

		PassengerServiceImpl ps = ac.getBean(PassengerServiceImpl.class);
		ps.registerPassenger();
	}

}
