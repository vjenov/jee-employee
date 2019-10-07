package com.employee.web.enums;

public enum DBURL {
	ORACLE_URL;
	
	public String toString() {
		String url ="";
		switch (this) {
		case ORACLE_URL:
			url = "jdbc:oracle:thin:@localhost:1521:xe";
			break;
		}
		return url;
	}
}
