package com.cts.pss.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pss.utils.PassengerUtils;

@Service
public class PassengerServiceImpl {
	
	@Autowired
	private PassengerDaoImpl pdao;
	
	@Autowired
	private PassengerUtils pu;
	
	public void registerPassenger() {
		pu.listAllPassengers();
		System.out.println("Service:: PassengerDaoImpl::registerPassenger");
		pdao.addPassenger();
		
	}

}
