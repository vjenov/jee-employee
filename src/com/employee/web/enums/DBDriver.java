package com.employee.web.enums;

public enum DBDriver {
	ORACLE_DRIVER;
	
	public String toString() {
		String driver ="";
		switch (this) {
		case ORACLE_DRIVER :
			driver = "oracle.jdbc.OracleDriver";
			break;
		default :
			break;
		}
		return driver;
	}
	
}
