package com.cts.pss.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.logging.ErrorManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pss.entity.BookingRecord;
import com.cts.pss.entity.Flight;
import com.cts.pss.entity.FlightInfo;
import com.cts.pss.entity.Passenger;
import com.cts.pss.model.ErrorMessage;
import com.cts.pss.repository.BookingRepository;
import com.cts.pss.repository.FlightRepository;

@Service
public class BookingServiceImpl {

	@Autowired
	private BookingRepository bookingDao;
	@Autowired
	private FlightRepository flightDao;
	
	//Cancel Entire Booking by Booking ID
	public Object cancelBooking(int bookingId) {
		
		if(bookingDao.existsById(bookingId)) {
			bookingDao.deleteById(bookingId);
			return new ErrorMessage(200, "Booking Canceled for Booking Id "+bookingId);
		}
		
		return new ErrorMessage(404, "Booking Id "+bookingId+" Not Found. Bookiing Not Canceled");
	}
	
	
	
	// get Booking Details by Booking ID:
	public BookingRecord getBookingDataById(int bookingId) {
		return bookingDao.findById(bookingId).orElse(null);	
	}
	// get Booking Details by Primary Passenger Mobile Number:
	public List<BookingRecord> getBookingDataByMobileNumber(long mobileNumber) {
		return bookingDao.findByPassenger_MobileNumber(mobileNumber);
	}

	

	// Book Flight
	public Object bookFlight(int flightId, int travellers, Passenger passenger) {

		Flight flight = flightDao.findById(flightId).orElse(null);
		
		
		BookingRecord bookingRecord = null;
		if (flight.getInventory().getAvailableSeats() < travellers) {
			System.out.println(">>>> No More Seats. Booking Not Done <<<<");
			return new ErrorMessage(404, "Not Enough Seats to Book. Booking Not Completed");
		}

		bookingRecord = new BookingRecord(LocalDateTime.now(), flight.getOrigin(), flight.getDestination(),
				flight.getFlightNumber(), flight.getFlightDate(), flight.getFlightTime(),
				flight.getFare().getTicketFare() * travellers, "CONFIRMED", travellers, flight.getFlightInfo(),
				passenger);

		if (passenger.getCoPassengers().size() != travellers - 1) {
			System.out.println(">>>>> Invalid Passenger Count provided <<<<");
			return new ErrorMessage(404, "Expected Passenger Count is "+travellers+" But Found "+(passenger.getCoPassengers().size()+1)+" Passenger Data.Booking Not Done");
		}
		
		// Update Flight Inventory for Number of Tickets Booked
		flight.getInventory().setAvailableSeats(flight.getInventory().getAvailableSeats()-travellers);
		flightDao.save(flight);
		bookingDao.save(bookingRecord);
		

		return bookingRecord;
	}

}
