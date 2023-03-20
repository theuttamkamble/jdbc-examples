package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertOperation {
	
	
	public static boolean insertStudent(Student student) {
		boolean isInserted = false;
		
		try {
			// create query
			String q = "insert into studentjdbc(sid, sname, phone, city) values(?, ?, ?, ?)";
			
			Connection conn = GetSQLConnection.getSQLConnection();
			
			// PreparedStatement for Dynamic Queries
			PreparedStatement pst = conn.prepareStatement(q);
			pst.setInt(1, student.getSid());
			pst.setString(2, student.getSname());
			pst.setString(3, student.getPhone());
			pst.setString(4, student.getCity());
			
			int x = pst.executeUpdate();
			System.out.println("x:="+x);
			isInserted = true;
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isInserted;
	}
}
