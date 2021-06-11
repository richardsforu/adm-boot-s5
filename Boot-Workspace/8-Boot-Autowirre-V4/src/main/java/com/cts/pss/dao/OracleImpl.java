package com.cts.pss.dao;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class OracleImpl implements DatabaseType {

	@Override
	public void connect() {
		System.out.println(">>>> Connecting with Oracle database");

	}

}
