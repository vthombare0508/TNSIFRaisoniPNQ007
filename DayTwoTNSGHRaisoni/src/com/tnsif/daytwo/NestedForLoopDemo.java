package com.tnsif.daytwo;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		
		int beg=10;
		int end=20;
		
		
		for(int i=beg; i<=end; i++) // outer forloop
		{
			for(int j=1; j<=10; j++) // inner forloop
			{
				System.out.println(i+"*"+j+"= "+ i*j);
			}
			System.out.println();
		}

	}

}
