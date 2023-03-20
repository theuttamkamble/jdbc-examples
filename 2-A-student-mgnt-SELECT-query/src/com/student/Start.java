package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Start {

	public static void main(String[] args) {
		// driver - url - username - password
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "root";
		
		try {			
			// Register the driver
			Class.forName(driver);
			
			// create connection
			Connection con = DriverManager.getConnection(url, username, password);
			
			// create statement
			Statement stm = con.createStatement();
			
			// String query
			String query = "select * from studentjdbc";
			
			// result set
			ResultSet rs = stm.executeQuery(query);
			
			// print result set using index number starting from 1
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.println(rs.getString(4));
			}
			
			System.out.println("----------------------------------------");
			
			ResultSet rs2 = stm.executeQuery(query);
			
			// printing ResultSet using fields of table 
			while(rs2.next()) {
				System.out.print(rs2.getInt("sid")+"\t");
				System.out.print(rs2.getString("sname")+" \t");
				System.out.print(rs2.getString("phone")+"\t");
				System.out.println(rs2.getString("city"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}

}
