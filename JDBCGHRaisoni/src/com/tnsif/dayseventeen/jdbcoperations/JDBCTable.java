package com.tnsif.dayseventeen.jdbcoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTable {

	public static void main(String[] args) {
		
		// Step1: Load or Register the Driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded successfully");
			
		//Step2: Create connection between java and sql
			
			        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PNQ07","root","root");
			        System.out.println("Connection created successfully");
			        
		// Step3: Create a statement object
			        
			        Statement stmt = con.createStatement();
			        System.out.println("Statement create successfully");
			        
		// Step4: Write a querry
			        String q= "create table Student(stdid int, sname varchar(20), subject varchar(20), duration double)";
			        stmt.execute(q);
			        
        // step5: Close Connection
			        con.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

}
