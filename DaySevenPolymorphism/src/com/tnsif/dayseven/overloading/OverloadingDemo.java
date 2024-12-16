package com.tnsif.dayseven.overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		System.out.println("--------------------Method Overloading -----------------");
		
		System.out.println("Addition of two integers : "+MethodOverloading.addition(10, 20));
    System.out.println("Addition of two floating numbers :"+ MethodOverloading.addition(10f, 21.2f));
	System.out.println("Addition of one integer and one float :"+MethodOverloading.addition(21, 4.5f));
	System.out.println("Addition of one float and one integer :"+ MethodOverloading.addition(15.4f,  12));
	System.out.println("Addition of String values : "+ MethodOverloading.addition("Hello ", "World"));
	
	
	System.out.println("------- constructor Overloading---------");
	
	Point p= new Point(); // default constructor invoked
	System.out.println(p);
	
	
	Point p1 = new Point(14.3f);  // single parameter constructor
	System.out.println(p1);
	
	Point p2 = new Point(11.3f, 12.4f);
	System.out.println(p2);
	
	
	}

}
