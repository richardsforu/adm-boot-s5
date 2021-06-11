package com.cts.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.employee.dao.EmployeeDao;
import com.cts.employee.service.EmployeeServiceImpl;

@SpringBootApplication

public class Application {

	public static void main(String[] args) {
		
	 // user ...	
		
	 ApplicationContext ac=	SpringApplication.run(Application.class, args);
	 
    // EmployeeDao empDao = ac.getBean(EmployeeDao.class);
     
	 EmployeeServiceImpl es = ac.getBean(EmployeeServiceImpl.class);
	 
	 //es.setEmpDao(empDao); // DI 
	 
	 es.saveEmployee();
	 
	 
	}

}
