package com.gsu.gg.manager;

import java.util.List;

import com.gsu.gg.dao.RegistrationDAO;
import com.gsu.gg.to.CourseSection;
import com.gsu.gg.to.User;

public class RegistrationManager {

	//Login a person
	public static User loginUser(String userName, String password) throws Exception{
		//Try to find the user in the db.
		User user = RegistrationDAO.getUser(userName);
		
		if(user == null){
			throw new Exception("Unable to find the user " + userName + ".");
		}
		
		//Authenticate the user.
		if(!password.equals(user.getPassword())){
			throw new Exception("The password is incorrect.");
		}
	
		return user;
	}
	
	public static List<CourseSection> getCourseSectionsForUser(String user){
		return RegistrationDAO.getCoursesForUser(user);
	}
	//Create a Student
	
	//Create a Teacher
	
	//Update a Student
	
	//Update a Teacher
	
	//Get Student Info by email
	public static User getUser(String emailAddress){
		return RegistrationDAO.getUser(emailAddress);
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
