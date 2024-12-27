package com.tnsif.dayten;

import java.util.Arrays;

public class MultiDimArrayDemo {

	public static void main(String[] args) {

		int c[][] = {{12, 45, 23}, {10, 30, 4}, {2, 3, 78}, {1, 2, 3,}}; // new int[3][3]
		
		System.out.println("No of Rows in C array : "+ c.length);
		
		MLArray.printArray(c);
		
		
	}

}
