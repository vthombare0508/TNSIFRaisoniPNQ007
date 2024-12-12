package com.tnsif.daytwo;

public class DatatypesDemo {
	
	public static void main(String args[])
	{
		
		int x;  // variable declaration
		
		x = 10; // initialization of variable
		
		int y = 20; 
		
		
		// byte takes 1 byte
		
		byte byteMax = 127;
		byte byteMin = -128;
		
		System.out.println("Min range of byte is "+byteMin + " Max range of byte is "+ byteMax);
		
		// short - 2 bytes
		
		short shortMax = 32767;
		short shortMin = -32768;
		
		System.out.println("Min range of short is "+shortMin + " Max range of short is "+ shortMax);
		
		// int - 4bytes

		int maxInt = 2147483647;
		int minInt = -2147483648;
		
		System.out.println("Min range of int is "+minInt + " Max range of int is "+ maxInt);
		
		// long - 8bytes
		
		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775808L;
		
		System.out.println("Min range of long is " +minLong + " Max range of long is "+ maxLong);
		
		// boolean 
		
		boolean flag = false;
		System.out.println("Boolean value is "+ flag);
		System.out.println(x+20);
	}

}
