package com.cts.pss.controller;

import java.util.List;

import javax.persistence.PostRemove;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pss.entity.BookingRecord;
import com.cts.pss.entity.Passenger;
import com.cts.pss.service.BookingServiceImpl;

@RestController
@RequestMapping("api/pss/booking")
@CrossOrigin
public class BookingRestController {

	@Autowired
	private BookingServiceImpl bs;

	// Cancel Entire Booking
	@DeleteMapping("/{bookingId}")
	public ResponseEntity<?> cancelBooking(@PathVariable int bookingId) {
		Object obj = bs.cancelBooking(bookingId);
		return new ResponseEntity<>(obj, HttpStatus.OK);
	}

	// find BookingData By BookingID
	@GetMapping("/{bookingId}")
	public BookingRecord findBookingDataByBookingId(@PathVariable int bookingId) {
		return bs.getBookingDataById(bookingId);
	}

	// find BookingData By Passenger Mobile Number
	@GetMapping("/byMobileNumber/{mobileNumber}")
	public List<BookingRecord> findBookingDataByPassengerMobileNumber(@PathVariable long mobileNumber) {
		return bs.getBookingDataByMobileNumber(mobileNumber);
	}

	// Book Flight
	@PostMapping("/{flightId}/{travellers}")
	public ResponseEntity<?> bookFlight(@PathVariable int flightId, @PathVariable int travellers,
			@RequestBody Passenger passenger) {

		Object br = bs.bookFlight(flightId, travellers, passenger);
		if (br instanceof BookingRecord) {
			return new ResponseEntity<>(br, HttpStatus.OK);
		}
		return new ResponseEntity<>(br, HttpStatus.NOT_FOUND);
	}
}
