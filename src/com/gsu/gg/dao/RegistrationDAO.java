package com.gsu.gg.dao;

import com.gsu.gg.to.Course;
import com.gsu.gg.to.CourseSearch;
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
	
	private static final String INSERT_USER = "INSERT INTO USER (first_name,last_name,email_address,password,access_type) " +
			"values (?,?,?,?,?)";
	
	private static final String INSERT_COURSE_FOR_USER = "INSERT INTO User_Course (USER_ID,CRN) VALUES (?,?)";

	private static final String GET_ALL_COURSES = "select a.CRN, a.Name, a.Credit_Hours, a.Description, a.Department, a.Prerequisites, a.SECTION_ID, a.DAY_OF_WEEK, a.CLASS_TIME, a.STATUS "
			+ "from course a ";

	private static final String GET_USER_SQL = "SELECT EMAIL_ADDRESS, FIRST_NAME, LAST_NAME, PASSWORD, ACCESS_TYPE "
			+ "FROM USER " + "WHERE EMAIL_ADDRESS = ?";

	private static final String GET_COURSES_FOR_USERS = "SELECT a.CRN, a.Name, a.Credit_Hours, a.Description, a.Department, a.Prerequisites, a.SECTION_ID, a.DAY_OF_WEEK, a.CLASS_TIME, a.STATUS "
			+ "FROM course a, " + "user_course b " + "WHERE a.CRN = B.CRN " + "AND b.user_id = ? ";
        
        private static final String GET_COURSES_FOR_SEARCH = "";

	public static User getUser(String emailAddress) throws ClassNotFoundException, SQLException {

		Connection connection = null;
		PreparedStatement statement = null;
		User user = null;

		connection = DBUtil.getConnection();
		statement = connection.prepareStatement(GET_USER_SQL);
		statement.setString(1, emailAddress);

		ResultSet rs = statement.executeQuery();

		if (rs.next()) {
			user = new User();

			user.setEmailAddress(rs.getString("email_address"));
			user.setFirstName(rs.getString("first_name"));
			user.setLastName(rs.getString("last_name"));
			user.setPassword(rs.getString("password"));
			user.setAccessType(rs.getInt("access_type"));
		}

                connection.close();
		return user;
	}

	public static List<CourseSection> getCoursesForUser(String userId) throws SQLException, ClassNotFoundException {

		List<CourseSection> courseList = new ArrayList<>();

		Connection connection = null;
		PreparedStatement statement = null;
		connection = DBUtil.getConnection();
		statement = connection.prepareStatement(GET_COURSES_FOR_USERS);
		statement.setString(1, userId);

		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			CourseSection course = new CourseSection();
			course.setCreditHours(rs.getInt("Credit_Hours"));
			course.setCrn(rs.getInt("CRN"));
			course.setDayOfTheWeek(rs.getString("Day_Of_Week"));
			course.setDescription(rs.getString("Description"));
			course.setName(rs.getString("Name"));
			course.setPrerequisites(rs.getString("Prerequisites"));
			course.setSectionID(rs.getInt("Section_ID"));
			course.setTime(rs.getString("Class_Time"));
			course.setStatus(rs.getString("Status"));
			courseList.add(course);
		}

                connection.close();
		return courseList;
	}

	public static List<CourseSection> getAllCourses() throws SQLException, ClassNotFoundException {

		List<CourseSection> courseList = new ArrayList<>();

		Connection connection = null;
		PreparedStatement statement = null;
		connection = DBUtil.getConnection();
		statement = connection.prepareStatement(GET_ALL_COURSES);

		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			CourseSection course = new CourseSection();
			course.setCreditHours(rs.getInt("Credit_Hours"));
			course.setCrn(rs.getInt("CRN"));
			course.setDayOfTheWeek(rs.getString("Day_Of_Week"));
			course.setDescription(rs.getString("Description"));
			course.setName(rs.getString("Name"));
			course.setPrerequisites(rs.getString("Prerequisites"));
			course.setSectionID(rs.getInt("Section_ID"));
			course.setTime(rs.getString("Class_Time"));
			course.setStatus(rs.getString("Status"));
			courseList.add(course);
		}

                connection.close();
		return courseList;
	}

	public static void createCoursesForUser(String userID, List<Integer> crnList) throws ClassNotFoundException, SQLException{
		Connection connection = null;
		PreparedStatement statement = null;
		connection = DBUtil.getConnection();
		
		for(Integer crn : crnList){
			statement = connection.prepareStatement(INSERT_COURSE_FOR_USER);
			statement.setString(1, userID);
			statement.setInt(2, crn);
			
			statement.executeUpdate();
		}
		connection.close();
	}

	public static void createUser(User user) throws ClassNotFoundException, SQLException {

            Connection connection = null;
            PreparedStatement statement = null;
            connection = DBUtil.getConnection();

            statement = connection.prepareStatement(INSERT_USER);

            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getEmailAddress());
            statement.setString(4, user.getPassword());
            statement.setInt(5, user.getAccessType());

            statement.executeUpdate();
                connection.close();
	}

    public static List<Course> getSearchCourses(CourseSearch search) {
        return new ArrayList();
    }
}
