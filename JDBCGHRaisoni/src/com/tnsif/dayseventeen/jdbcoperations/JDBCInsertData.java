package com.tnsif.dayseventeen.jdbcoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertData {

	public static void main(String[] args) {
		try {
			
			// Step1: Load or Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded successfully");
			
			//Step2: Create connection between java and sql
		    Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/PNQ07", "root","root");		
	        System.out.println("Connection created successfully");
	        
	    	// Step3: Create a statement object
	       
	        Statement stmt = con.createStatement();
	        System.out.println("Statement create successfully");

			// Step4 : Write a querry
	        
			String q= "insert into student values('102', 'Priti','HTML','1')";
			stmt.executeUpdate(q);
			
			// Step5: close connection
			
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
