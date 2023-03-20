package com.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetSQLConnection {
	private static Connection con;
	
	public static Connection getSqlConnection() {
		
		// driver - url - username - password
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "root";
		
		try {
			// Register the driver
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, username, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
