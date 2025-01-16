package com.tnsif.dayeleven;

public class NestedTryBlockEx {
	
	public static int divide(int x, int y)
	{
		int z=0;
		z= x/y;
		System.out.println("Result of division is z : "+ z);
		return z;
	}
	public static void main(String[] args) {
		
		int x,y,z;
		try {
			x=Integer.parseInt(args[0]);   
			y= Integer.parseInt(args[1]);
			
			try {
				z=divide(x,y);
			}
			catch(ArithmeticException s)
			{
			System.err.println("Error! A number cannot be devided by 0");	
			}
		}
		catch(NumberFormatException e)
		{
			System.err.println("Error! Invalid input number must be an integer");
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.err.println("error! please pass numbers");
		}
		 
		
		

	}

}
