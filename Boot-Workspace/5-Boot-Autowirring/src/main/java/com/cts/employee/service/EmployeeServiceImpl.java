package com.cts.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.employee.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl {

	@Autowired
	private EmployeeDao empDao;

	/*
	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}
	*/

	public void saveEmployee() {
		System.out.println("Service:: EmployeeServiceImpl :: saveEmployee");
		// invoke dao class save method

		empDao.save();
	}

}
