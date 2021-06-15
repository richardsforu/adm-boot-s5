package com.cts.product.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = "mongo")
public class DataBaseServiceImpl {
	
	
	
	
	@Value("${city}")
	private String cityName;
	
	@Bean
	public void test() {
		System.out.println(">>>> City Name:: "+cityName);
	}
	
	

}
