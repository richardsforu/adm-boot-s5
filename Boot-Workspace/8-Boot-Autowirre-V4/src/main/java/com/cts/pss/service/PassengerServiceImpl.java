package com.cts.pss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.cts.pss.dao.DatabaseType;

@Service
public class PassengerServiceImpl {

	public PassengerServiceImpl() {
		System.out.println(">>>>> PassengerServiceImpl object created....");
	}

	@Autowired
	@Qualifier("mysql")
	private DatabaseType dataType;

	public void registerPassenger() {
		System.out.println(">>>> Service:: PassengerServiceImpl::registerPassenger");
		dataType.connect();
	}

}
