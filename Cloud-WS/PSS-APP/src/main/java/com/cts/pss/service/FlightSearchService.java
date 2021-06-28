package com.cts.pss.service;

import java.time.LocalDate;
import java.util.List;

import com.cts.pss.entity.Fare;
import com.cts.pss.entity.Flight;
import com.cts.pss.model.SearchQuery;

public interface FlightSearchService {
	
	List<Flight> findByOriginAndDestinationAndFlightDate(String origin,String destination,LocalDate flightDate);
	Flight findByOriginAndDestinationAndFlightDateAndFlightNumber(String origin,String destination,LocalDate flightDate,String flightNumber);
	// List all airindia flights only
	List<Flight> findByFlightInfo_airlineInfo_airlineId(int airlineId);
	Flight findById(int id);
	List<Flight> findAll();
	List<Flight> findByOriginAndDestinationAndFlightDateV1(SearchQuery query);
	Flight findByOriginAndDestinationAndFlightDateAndFlightNumber(SearchQuery query);
	Flight scheduleNewFlight(Flight flight);
	void removeScheduledFlightById(int id);
	public void deleteByOriginAndDestinationAndFlightDateAndFlightNumber(String origin,String destination,LocalDate flightDate,String flightNumber);
	Fare getFareByFlightId(int flightId);
	Fare findFareByOriginAndDestinationAndFlightDateAndFlightNumber(String origin, String destination,
			LocalDate flightDate, String flightNumber);
	
	
	

}
