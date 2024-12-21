package com.tnsif.daynine.Stringdemo;

public class SampleStringDemo {
	
	public static void main(String args[])
	{
		
		String str = "Hello Students"; // Literal Method/Primitive type
		
		String s1 = new String("Java");  // object type
		
		char c[]= {'I','n','d','i','a'};
		
		String s2 = new String(c);  
		
		String s3 = new String(s1);
		
		
		System.out.println(str);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// using concatenation to prevent long lines
		
		String longstr = "This is to show "+"how string concatenation "+"can happen with additional "+
		                   " operator";
		
		System.out.println(longstr);
		
		String s4 = str+ " we are learning "+s1;
		
		System.out.println(s4);
		
		
		
		
		
		
		
	}

}
