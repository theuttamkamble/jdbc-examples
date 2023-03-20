package com.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetSQLConnection {
	private static Connection conn;
	
	public static Connection getSQLConnection() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "root";
		
		try {
			// 1.... Load the Driver
			Class.forName(driver);
			
			// 2.... Create the Connection
			conn = DriverManager.getConnection(url, username, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
