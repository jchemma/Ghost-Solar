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
	
	//Create a User
	public static void createUser(User user) throws Exception{
		try {
			RegistrationDAO.createUser(user);
		} catch (ClassNotFoundException | SQLException e) {
			throw new Exception("Unable to create user.", e);
		}
	}
	
	
	
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
		User user = new User();
		
		user.setFirstName("Kyle");
		user.setLastName("Dye");
		user.setEmailAddress("kyledye@bellsouth.net");
		user.setPassword("password");
		user.setAccessType(2);
		
		try {
			RegistrationDAO.createUser(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
