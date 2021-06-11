package com.cts.pss.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.pss.utils.PassengerUtils;

@Repository
public class PassengerDaoImpl {

	@Autowired
	private PassengerUtils pu;

	public void addPassenger() {

		// Before adding, check passenger already added or not?
		// get list of all passengers who already added...
		pu.listAllPassengers();
		System.out.println("Dao::PassengerDaoImpl::addPassenger");
		System.out.println("Passenger is added...");

	}

}
