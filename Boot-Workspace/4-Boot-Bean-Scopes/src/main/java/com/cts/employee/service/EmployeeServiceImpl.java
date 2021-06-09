package com.cts.employee.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
//@Scope("prototype")
@Lazy(value = true)
public class EmployeeServiceImpl implements EmployeeService {
	
	@Value("${name}")
	private String employeeName;
	
	/*
	 * Bean Scopes
	 * ---------------
	 * 	-> singleton : by default all beans in spring/boot is singleton scope
	 *  -> prototype
	 *  -> request
	 *  -> response
	 *  -> application
	 *  
	 *  Note: if type of bean is singleton, then by default spring uses eager loading
	 *  
	 *  
	 */
	
	public EmployeeServiceImpl() {
		System.out.println(">>>EmployeeServiceImpl created on "+System.identityHashCode(this));
		System.out.println("Name: "+employeeName);

	}
	
	@Override
	public void findEmployee() {
		System.out.println(">>>EmployeeServiceImpl::findEmployee on "+System.identityHashCode(this));
		System.out.println("Name: "+employeeName);

	}

}
