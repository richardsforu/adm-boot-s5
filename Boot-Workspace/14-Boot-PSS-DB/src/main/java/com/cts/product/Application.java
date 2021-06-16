package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.repository.FlightRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		FlightRepository flightDao = ac.getBean(FlightRepository.class);

		flightDao.findAll().forEach(System.out::println);

	}

}
