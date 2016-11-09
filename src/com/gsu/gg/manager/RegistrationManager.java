package com.gsu.gg.manager;

import com.gsu.gg.dao.RegistrationDAO;
import com.gsu.gg.to.Student;

public class RegistrationManager {

	//Create a Student
	
	//Create a Teacher
	
	//Update a Student
	
	//Update a Teacher
	
	//Get Student Info by email
	public static Student getStudentInformation(String emailAddress){
		return RegistrationDAO.getStudentInformation(emailAddress);
	}
	
	
	//Get Teacher Info by email
	
	//Get All Classes
	
	//Get Classes By CRN
	
	//Get Classes By Name
	
	//Get Classes By Department
	
	//Get All Sections
	
	//Get Section By Id
	
	//Get Section By Class
	
	//Get Class and Section By Student
	
	//Get Class and Section By Teacher
}
