package com.tnsif.daynine.Stringdemo;

public class StringOperationsDemo {

	public static void main(String[] args) {
	
		String s1= new String("     Indian       ");
		String s2=new String("");
		                       
		System.out.println(s1);
		System.out.println("Length of String : "+ s1.length());
		String s3= s1.trim();
		System.out.println(s3.length());
		System.out.println(s1.charAt(2));
		
		System.out.println(s1.toUpperCase());
		System.out.println();
		System.out.println(s1.substring(2, 5));
		System.out.println(s1.substring(2));
		
		System.out.println("S2 is Empty or not : "+s2.isEmpty());
		System.out.println(s2.length());
		
		// String Comparison
		s1="Good Morning";
		s2=new String(s1);
		s3= "good morning";
		
		System.out.println(s1+ " equals "+s3 + " -> "+ s1.equals(s3));
		System.out.println(s1+ " equals "+s3 + " -> "+ s1.equalsIgnoreCase(s3));
		
		
		
		
	}

}
