package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Start {
	public static void main(String[] args) {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "root";
			
			// Register the driver
			Class.forName(driver);
			
			// create connection
			Connection conn = DriverManager.getConnection(url, username, password);	
			
// Statement for Static Query
			Statement stm = conn.createStatement();
			
			// Static Query
			String staticQuery = "insert into studentjdbc values (102, 'Ram', '9876543211', 'Mumbai');";
			
			int x = stm.executeUpdate(staticQuery);
			System.out.println("result od static query "+x);
			
			
			
			
			
// PreparedStatement for Dynamic Query
			
			// Dynamic Query
			String dynamicQuery = "insert into studentjdbc(sid, sname, phone, city) values(?, ?, ?, ?)";
			
			// prepared statement object
			PreparedStatement pst = conn.prepareStatement(dynamicQuery);
			pst.setInt(1, 120);
			pst.setString(2, "Manisha");
			pst.setString(3, "9876543220");
			pst.setString(4, "Maval");
			
			int result = pst.executeUpdate();
			System.out.println("result of dynamic query "+result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

