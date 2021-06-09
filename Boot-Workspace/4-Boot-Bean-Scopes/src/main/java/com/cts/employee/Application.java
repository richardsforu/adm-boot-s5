package com.cts.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.employee.service.DepartmentServiceImpl;
import com.cts.employee.service.EmployeeServiceImpl;

@SpringBootApplication
public class Application {
	

	public static void main(String[] args) {
		
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		
		EmployeeServiceImpl es1 = ac.getBean(EmployeeServiceImpl.class);
		//DepartmentServiceImpl ds = ac.getBean(DepartmentServiceImpl.class);
	//	EmployeeServiceImpl es2 = ac.getBean(EmployeeServiceImpl.class);
		
		es1.findEmployee();
		//es2.findEmployee();
		
		
		System.out.println(">>>>> THE END <<<<<");
		
		
	}

}
