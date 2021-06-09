package com.cts.employee.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
//@Lazy
public class DepartmentServiceImpl {
	public DepartmentServiceImpl() {
		System.out.println(">>>DepartmentServiceImpl created on "+System.identityHashCode(this));
	}

}
