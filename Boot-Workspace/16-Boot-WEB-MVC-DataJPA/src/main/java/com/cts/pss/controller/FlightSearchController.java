package com.cts.pss.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.pss.entity.Flight;
import com.cts.pss.model.SearchQuery;
import com.cts.pss.repository.FlightRepository;
import com.cts.pss.service.FlightSearchService;

@Controller
public class FlightSearchController {

	@Autowired
	private FlightSearchService flightService;

	@RequestMapping("/")
	public String welcome() {
		return "index";
	}

	@RequestMapping(value = "filterFlights")
	public String filterFlightsV1(@RequestParam("origin") String origin,
			@RequestParam("destination") String destination,
			@RequestParam("flightDate") @DateTimeFormat(iso = ISO.DATE) LocalDate flightDate,
			@RequestParam("travellers") int travellers) {

		

		return "search-flight-form";
	}
	
	
	@RequestMapping(value = "filterFlightsV2")
	public String filterFlightsV2(@ModelAttribute SearchQuery query,Model model) {
		
		List<Flight> flights = flightService.findByOriginAndDestinationAndFlightDateV1(query);
		
		model.addAttribute("flights",flights);
		
		return "search-flight-form";
	}
	

	@RequestMapping(value = "display")
	public String displayAllScheduledFlights(Model model) {

		List<Flight> flights = flightService.findAll();

		model.addAttribute("scheduledFlights", flights);

		return "flights";
		//return "redirect:loadForm";
	}

	@RequestMapping(value = "loadForm")
	public String loadFlightSearchForm(Model model) {
		
		List<Flight> flights=null;
		model.addAttribute("flights",flights);
		
		return "search-flight-form";
	}

}
