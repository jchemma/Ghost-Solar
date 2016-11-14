package com.gsu.gg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gsu.gg.to.CourseSection;
import com.gsu.gg.to.User;
import com.gsu.gg.util.DBUtil;

public class RegistrationDAO {

	private static final String GET_USER_SQL = "SELECT EMAIL_ADDRESS, FIRST_NAME, LAST_NAME, PASSWORD FROM USER WHERE EMAIL_ADDRESS = ?";
	
	public static User getUser(String emailAddress) throws ClassNotFoundException, SQLException{
		
		Connection connection = null;
		PreparedStatement statement = null;
		User user = null;
		
		connection = DBUtil.getConnection();
		statement = connection.prepareStatement(GET_USER_SQL);
		ResultSet rs = statement.executeQuery();
		
		if (rs.next()) {
			user = new User();
			
			user.setEmailAddress(rs.getString("email_address"));
			user.setFirstName(rs.getString("first_name"));
			user.setLastName(rs.getString("last_name"));
			user.setPassword(rs.getString("password"));
		}
		
		return user;
	}
	
	public static List<CourseSection> getCoursesForUser(String personId){
		
		List<CourseSection> courseList = new ArrayList<>();
		
		CourseSection course1 = new CourseSection();
		course1.setCreditHours(5);
		course1.setCrn(12);
		course1.setDayOfTheWeek("Mon");
		course1.setDescription("Course 1");
		course1.setName("Course 1");
		course1.setPrerequisites("Prereq 1");
		course1.setSectionID(1);
		course1.setTime("1:00 PM - 3:00 PM");
		course1.setStatus("A");
		
		CourseSection course2 = new CourseSection();
		course2.setCreditHours(5);
		course2.setCrn(12);
		course2.setDayOfTheWeek("Mon");
		course2.setDescription("Course 1");
		course2.setName("Course 1");
		course2.setPrerequisites("Prereq 1");
		course2.setSectionID(1);
		course2.setTime("1:00 PM - 3:00 PM");
		course2.setStatus("W");
		
		courseList.add(course1);
		courseList.add(course2);
		
		return courseList;
	}
}
