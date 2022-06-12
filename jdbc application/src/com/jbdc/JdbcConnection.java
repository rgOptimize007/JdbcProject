package com.jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 *  Seven steps to get a JDBC connection
 *  1) Load the driver in your project
 *  2) Register the driver in your project
 *  3) Get the connection to your database
 *  4) Create a statement on your connection
 *  5) execute the query with help of statement
 *  6) Use the queried results in your project
 *  7) Close the statement and connection
 */


public class JdbcConnection {

	public Student getConnection(int rollNo) throws Exception {
	
		String url = "jdbc:mysql://localhost:3306/school"; 
		String user = "root";
		String password = "12345";
		String query = "select * from student where id  = " + rollNo;
		boolean foundFlag = false;
		Student std = new Student();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		Statement  st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()){
		    if(rs.getInt(1) == rollNo){
		    	std.setStudentId(rollNo);
		    	std.setStudentName(rs.getString(2));
		    	std.setStudentPhoneNumber(rs.getString(3));
		    	std.setAddress(rs.getString(4));
		    	foundFlag = true;
		    	break;
		     }
		    }
		    if(foundFlag)
		    	return std;
		    else
		    	return null;
	}
}
