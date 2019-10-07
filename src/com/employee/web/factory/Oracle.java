package com.employee.web.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import com.employee.web.enums.DBDriver;
import com.employee.web.enums.DBURL;
import com.employee.web.pool.Constants;

public class Oracle implements Database{
	
	@Override
	public Connection getConnection() {
	Connection conn =null;	
	try {
		Class.forName(DBDriver.ORACLE_DRIVER.toString());
		conn = DriverManager.getConnection(DBURL.ORACLE_URL.toString(), 
				Constants.USERNAME, 
				Constants.PASSWORD);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return conn;
	}
	
}
