package com.dbconnector;
import java.sql.*;
public class DBManager {
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		Connection connection = null;
		//Step1: Register Driver Class
		Class.forName("com.mysql.cj.jdbc.Driver");
        /*Step2: Connect to database with 3 parameters
         * 1.dbUrl:Server, Port, DBName< SSL connection type and ServerTimeZone
         * 2.dbUser
         * 3.dbPassword
         * */
		String dbUrl = "jdbc:mysql://localhost:3306/gowildwildlife?useSSL=true&serverTimezone=UTC";
		String dbUser = "root";
		String dbPass = "Admin1234";
		connection = DriverManager.getConnection(dbUrl,dbUser,dbPass);
		return connection;
	}
}
