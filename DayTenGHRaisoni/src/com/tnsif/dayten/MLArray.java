package com.tnsif.dayten;

public class MLArray {
	
	static void printArray(int c[][])
	{
		System.out.println("Array Elements are as follows : ");
		for(int i=0; i<c.length; i++)   // outer loop for rows
		{
			for(int j=0; j< c[i].length; j++)  // inner loop for columns
			{
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
	}
}

