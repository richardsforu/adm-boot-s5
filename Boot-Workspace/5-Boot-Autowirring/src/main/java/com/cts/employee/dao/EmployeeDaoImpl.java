package com.cts.employee.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	// Dependency

	@Override
	public void save() {
		System.out.println("Dao :: EmployeeDaoImpl:: save method");
	}
	
	

}
