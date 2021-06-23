package com.cts.pss.service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pss.entity.Fare;
import com.cts.pss.entity.Flight;
import com.cts.pss.model.SearchQuery;
import com.cts.pss.repository.FlightRepository;

@Service
public class FlightSearchServiceImpl implements FlightSearchService {

	@Autowired
	private FlightRepository flightDao;
	
	
	//remove scheduled flight by flightID
	@Override
	public void removeScheduledFlightById(int id) {
		flightDao.deleteById(id);
		
	}

	// Schedule a New Flight
	@Override
	public Flight scheduleNewFlight(Flight flight) {
		return flightDao.save(flight);

	}

	@Override
	public List<Flight> findByOriginAndDestinationAndFlightDate(String origin, String destination,
			LocalDate flightDate) {
		return flightDao.findByOriginAndDestinationAndFlightDate(origin, destination, flightDate);
	}

	@Override
	public List<Flight> findByOriginAndDestinationAndFlightDateV1(SearchQuery query) {

		List<Flight> flights = flightDao.findByOriginAndDestinationAndFlightDate(query.getOrigin(),
				query.getDestination(), query.getFlightDate());

		return flights.stream().filter(flight -> flight.getInventory().getAvailableSeats() >= query.getTravellers())
				.collect(Collectors.toList());
	}

	@Override
	public Flight findByOriginAndDestinationAndFlightDateAndFlightNumber(SearchQuery query) {
		return flightDao.findByOriginAndDestinationAndFlightDateAndFlightNumber(query.getOrigin(),
				query.getDestination(), query.getFlightDate(), query.getFlightNumber());
	}

	@Override
	public Flight findByOriginAndDestinationAndFlightDateAndFlightNumber(String origin, String destination,
			LocalDate flightDate, String flightNumber) {
		// TODO Auto-generated method stub

		return flightDao.findByOriginAndDestinationAndFlightDateAndFlightNumber(origin, destination, flightDate,
				flightNumber);
	}

	@Override
	public List<Flight> findByFlightInfo_airlineInfo_airlineId(int airlineId) {
		// TODO Auto-generated method stub
		return flightDao.findByFlightInfo_airlineInfo_airlineId(airlineId);
	}

	@Override
	public Flight findById(int id) {
		// TODO Auto-generated method stub
		return flightDao.findById(id).orElse(null);
	}

	@Override
	public List<Flight> findAll() {
		// TODO Auto-generated method stub
		return flightDao.findAll();
	}
	
	
	// Find Fare of a Flight
	@Override
	public Fare findFareByOriginAndDestinationAndFlightDateAndFlightNumber(String origin, String destination,
			LocalDate flightDate, String flightNumber) {
		// TODO Auto-generated method stub

		return flightDao.findByOriginAndDestinationAndFlightDateAndFlightNumber(origin, destination, flightDate,
				flightNumber).getFare();
	}
	
	
	
	// get Fare of a flight
	@Override
	public Fare getFareByFlightId(int flightId) {
		return flightDao.findById(flightId).orElse(null).getFare();
	}
	
	
	// delete scheduled flight
	@Override
	public void deleteByOriginAndDestinationAndFlightDateAndFlightNumber(String origin, String destination,
			LocalDate flightDate, String flightNumber) {
		flightDao.deleteByOriginAndDestinationAndFlightDateAndFlightNumber(origin, destination, flightDate, flightNumber);
		
	}

}
