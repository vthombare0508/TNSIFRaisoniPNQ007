package com.tnsif.dayseventeen.jdbcoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AlterDemo {

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
				        
				        //Step4: Write querry
				        
				        String q="alter table student add primary key(stdid)";
				        
				        stmt.executeUpdate(q);
				        
				        System.out.println("Query executed");
						
				        //step5: close connection
				        
				        stmt.close();
					} catch (ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
	}

}
