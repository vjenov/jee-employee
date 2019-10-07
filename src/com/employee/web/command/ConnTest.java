package com.employee.web.command;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.employee.web.domains.EmployeeBean;

public class ConnTest {
	public static void main(String[] args) {
		
		EmployeeBean emp;
		Connection conn = null;
		Statement stmt = null; 
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe", 
				userName="c##taem", passWord="taem";

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, userName, passWord);
			if (conn != null) {
				System.out.println("연결성공");
				stmt = conn.createStatement();
				rs = stmt.executeQuery("SELECT *\r\n" + 
						"FROM EMP\r\n" + 
						"where deptno like 20\r\n");
				String employee = "";
				while (rs.next()) {
					employee = rs.getString("ename");
					System.out.println( "ename :  " + employee);
				}

				
			}else {
				System.out.println("연결 실패");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
