package com.gsu.gg.dao;

import java.util.ArrayList;
import java.util.List;

import com.gsu.gg.to.CourseSection;
import com.gsu.gg.to.User;

public class RegistrationDAO {

	public static User getUser(String emailAddress){
		User person = new User();
		
		//person.setEmailAddress("kpierre5@student.gsu.edu");
		person.setEmailAddress(emailAddress);
		person.setFirstName("Ken");
		person.setLastName("Pierre");
		person.setPassword("password");
		
		return person;
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
