package com.tnsif.daynine.Stringdemo;

public class StringComparison {

	public static void main(String[] args) {
		
		// creating string using Literals
		String s1= "TNSIF";
		String s2= "TNSIF";
		
		// creating strings using new operator
		String s3 = new String("TNSIF");
		String s4 = new String("TNSIF");
		
		// == and equals 
		
		System.out.println("S1 == s2 :"+(s1 == s2) + "\t s1 equals s2 : "+ s1.equals(s2));
		System.out.println("S1 == s3 :"+(s1 == s3) + "\t s1 equals s3 : "+ s1.equals(s3));
		System.out.println("s3 == s4 :"+(s3 == s4) + "\t s3 equals s4 : "+ s3.equals(s4));
		
		// hascode
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		// compareTo
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo("tnsif"));
		String s5 = "TNSIF";
		System.out.println(s5.compareTo(s1));
	}

}
