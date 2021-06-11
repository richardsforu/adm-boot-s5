package com.cts.pss.dao;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MySQLImpl implements DatabaseType{
	
	@Override
	public void connect() {
		System.out.println(">>>> Connecting with MYSQL database");
		
	}
	
	

}
