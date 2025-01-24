package com.tnsif.dayseventeen.jdbcoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {

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
	        
	        //Step4: resultset object
	        
	      //  String q= "Select * from student";
	     ResultSet rs= stmt.executeQuery("Select * from student");
	     
	     System.out.println("STDID \t NAME \t SUBJECT \t DURATION");
	     
	     while(rs.next())
	     {
	    	 System.out.println(rs.getInt(1) +"\t"+ rs.getString(2)+"\t"+ rs.getString(3)+"\t"+rs.getDouble(4));
	     }
			
	     
	   //step5: close connection
	        stmt.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
