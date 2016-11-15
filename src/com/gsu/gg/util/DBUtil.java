package com.gsu.gg.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private DBUtil(){}

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
    	
    	Class.forName("org.sqlite.JDBC");
    	Connection connection = null;
    	connection = DriverManager.getConnection("jdbc:sqlite:./GGDatabase","", "");
    	
        return connection;
    }
}
