package com.employee.web.factory;

import com.employee.web.enums.DB;

public class DatabaseFactory {
	public static Database createDatabase(String vendor){
		Database db = null;
		switch (DB.valueOf(vendor.toUpperCase())) {
		case ORACLE: db = new Oracle(); 
			break;
		}
		return db;
	}

}
