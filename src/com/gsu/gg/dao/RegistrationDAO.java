package com.gsu.gg.dao;

import com.gsu.gg.to.Student;

public class RegistrationDAO {

	public static Student getStudentInformation(String emailAddress){
		Student student = new Student();
		
		student.setEmailAddress("kpierre5@student.gsu.edu");
		student.setFirstName("Ken");
		student.setLastName("Pierre");
		student.setPassword("mypassword");
		
		return student;
	}
}
