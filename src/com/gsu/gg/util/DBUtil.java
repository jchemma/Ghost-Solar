package com.gsu.gg.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private DBUtil(){}

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
    	
    	Class.forName("org.sqlite.JDBC");
    	Connection connection = null;

    	String projectDirectory = System.getProperty("user.dir");
    	connection = DriverManager.getConnection("jdbc:sqlite:" + projectDirectory + "/GGDatabase","", "");
    	
        return connection;
    }
}
