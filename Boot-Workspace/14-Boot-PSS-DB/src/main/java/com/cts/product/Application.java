package com.cts.product;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Flight;
import com.cts.product.repository.BookingRepository;
import com.cts.product.repository.FlightRepository;
import com.cts.product.repository.PassengerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);

		FlightRepository flightDao = ac.getBean(FlightRepository.class);
		BookingRepository bookDao = ac.getBean(BookingRepository.class);
		PassengerRepository passengerDao = ac.getBean(PassengerRepository.class);

		// flightDao.findAll().forEach(System.out::println);
		// bookDao.findAll().forEach(System.out::println);
		//passengerDao.findAll().forEach(System.out::println);
		//flightDao.findByOriginAndDestinationAndFlightDate("Delhi", "Chennai", LocalDate.of(2021, 06, 26))
		//.forEach(System.out::println);
		
		//Flight flight=flightDao.findByOriginAndDestinationAndFlightDateAndFlightNumber("Delhi", "HYDERABAD", LocalDate.of(2021, 06, 26),"AI-850");
		
		//System.out.println(flight);
		
		flightDao.findByFlightInfo_airlineInfo_airlineId(4).forEach(System.out::println);
		
		

	}

}
