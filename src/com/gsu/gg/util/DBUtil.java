package com.gsu.gg.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private DBUtil(){}

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
    	
    	Class.forName("org.sqlite.JDBC");
    	Connection connection = null;
<<<<<<< HEAD
    	String projectDirectory = System.getProperty("user.dir");
    	connection = DriverManager.getConnection("jdbc:sqlite:" + projectDirectory + "/GGDatabase","", "");
=======
    	connection = DriverManager.getConnection("jdbc:sqlite:./GGDatabase","", "");
>>>>>>> 6e424196c72b89c6451402ff35db7c36c3b89c66
    	
        return connection;
    }
}
