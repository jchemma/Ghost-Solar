package com.gsu.gg.manager;

import java.sql.SQLException;
import java.util.ArrayList;
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
	
	public static List<CourseSection> getCourseSectionsForUser(String user) throws Exception {
		return RegistrationDAO.getCoursesForUser(user);
	}
	//Create a Student
	
	//Create a Teacher
	
	//Update a Student
	
	//Update a Teacher
	
	//Get Student Info by email
	public static User getUser(String emailAddress) throws Exception{
		try {
			return RegistrationDAO.getUser(emailAddress);
		} catch (ClassNotFoundException | SQLException e) {
			throw new Exception(e.getMessage(),e);
		}
	}
	
	
	//Get Teacher Info by email
	
	//Get All Classes
	public static List<CourseSection> getAllCourses() throws Exception {
		return RegistrationDAO.getAllCourses();
	}
	
	//Create Courses for a user.
	public static void createCoursesForUser(String userId, List<Integer> crnList) throws Exception{
		try {
			RegistrationDAO.createCoursesForUser(userId, crnList);
		} catch (ClassNotFoundException | SQLException e) {
			throw new Exception("Unable to create courses for users.", e);
		}
	}
	//Get Classes By CRN
	
	
	//Get Classes By Name
	
	//Get Classes By Department
	
	//Get All Sections
	
	//Get Section By Id
	
	//Get Section By Class
	
	//Get Class and Section By Student
	
	//Get Class and Section By Teacher
	
	public static void main(String[] args){
		List<Integer> crnList = new ArrayList<>();
		crnList.add(2);
		crnList.add(3);
		
		try {
			RegistrationManager.createCoursesForUser("kpierre5@student.gsu.edu", crnList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
