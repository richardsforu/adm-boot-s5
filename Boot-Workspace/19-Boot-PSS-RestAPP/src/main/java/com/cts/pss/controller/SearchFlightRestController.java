package com.cts.pss.controller;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pss.entity.Fare;
import com.cts.pss.entity.Flight;
import com.cts.pss.model.SearchQuery;
import com.cts.pss.service.FlightSearchService;

@RestController
@RequestMapping("api/pss/search")
@CrossOrigin
public class SearchFlightRestController {

	@Autowired
	private FlightSearchService searchService;

	
	// list scheduled flights by query
	@PostMapping
	public List<Flight> findFlights(@RequestBody SearchQuery query) {
		System.out.println(">>>>>>>>>> POSTING <<<<<<<<<");
		return searchService.findByOriginAndDestinationAndFlightDateV1(query);
	}
	
	

	@GetMapping("/{flightId}")
	public Flight findFlightById(@PathVariable int flightId) {
		return searchService.findById(flightId);
	}

	@GetMapping("/{origin}/{destination}/{flightDate}/{flightNumber}")
	public Flight findFlight(@PathVariable String origin, @PathVariable String destination,
			@PathVariable @DateTimeFormat(iso = ISO.DATE) LocalDate flightDate, @PathVariable String flightNumber) {

		return searchService.findByOriginAndDestinationAndFlightDateAndFlightNumber(origin, destination, flightDate,
				flightNumber);
	}

	//find flight by request body
	@GetMapping("/findFlight")
	public Flight findFlightV1(@RequestBody SearchQuery query) {
		return searchService.findByOriginAndDestinationAndFlightDateAndFlightNumber(query);
	}
	
	// find Fare 
	@GetMapping("/findFare/{flightId}")
	public Fare getFare(@PathVariable int flightId) {
		return searchService.getFareByFlightId(flightId);
	}
	
	// find Fare
	@GetMapping("/findFare/{origin}/{destination}/{flightDate}/{flightNumber}")
	public Fare findByByFlightDetails(@PathVariable String origin, @PathVariable String destination,
			@PathVariable @DateTimeFormat(iso = ISO.DATE) LocalDate flightDate, @PathVariable String flightNumber) {
		return searchService.findFareByOriginAndDestinationAndFlightDateAndFlightNumber(origin, destination, flightDate, flightNumber);
	}

	
	// schedule new Flight
	@PostMapping("/newFlight")
	public Flight scheduleNewFlight(@RequestBody Flight newFlight) {
		return searchService.scheduleNewFlight(newFlight);
	}
	
	
	
	
	
	
	
	
	
	

}
