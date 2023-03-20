package com.student;

public class Start {

	public static void main(String[] args) {
		Student student = new Student(101, "Krish", "9876543210", "Pune");
		
		Boolean result = InsertOperation.insertStudent(student);
		System.out.println(result);
		
		if(result) {
			System.out.println("successfully inserted.");
		} else {
			System.out.println("someting went wrong!");
		}
	}

}
