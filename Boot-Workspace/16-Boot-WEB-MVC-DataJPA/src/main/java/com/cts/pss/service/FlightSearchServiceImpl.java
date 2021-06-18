package com.cts.pss.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pss.entity.Flight;
import com.cts.pss.repository.FlightRepository;

@Service
public class FlightSearchServiceImpl implements FlightSearchService {

	@Autowired
	private FlightRepository flightDao;

	@Override
	public List<Flight> findByOriginAndDestinationAndFlightDate(String origin, String destination,
			LocalDate flightDate) {
		// TODO Auto-generated method stub
		return flightDao.findByOriginAndDestinationAndFlightDate(origin, destination, flightDate);
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

}
