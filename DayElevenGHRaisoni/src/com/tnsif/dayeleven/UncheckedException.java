package com.tnsif.dayeleven;

public class UncheckedException {

	public static void main(String[] args) {
		
		System.out.println("Try Catch Example");
		try {
			int x[];
			x=new int[] {1,2,3,4};
			System.out.println(x[7]);  
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.err.println("Specified index does not exist "+ a.getMessage());
		}

		
		System.out.println("Unchecked Exception");
	}

}
