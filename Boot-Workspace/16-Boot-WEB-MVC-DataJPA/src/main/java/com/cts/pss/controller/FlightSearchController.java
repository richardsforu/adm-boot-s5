package com.cts.pss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.pss.entity.Flight;
import com.cts.pss.repository.FlightRepository;
import com.cts.pss.service.FlightSearchService;

@Controller
public class FlightSearchController {
	
	@Autowired
	private FlightSearchService flightService;
	
	
	@RequestMapping(value = "display")
	public String displayAllScheduledFlights(Model model) {
		
		  List<Flight> flights = flightService.findAll();
		  
		  model.addAttribute("scheduledFlights",flights);
		  
		return "flights";
	}
	
	@RequestMapping(value = "loadForm")
	public String loadFlightSearchForm() {
		return "search-flight-form";
	}
	
	
	
	

}
