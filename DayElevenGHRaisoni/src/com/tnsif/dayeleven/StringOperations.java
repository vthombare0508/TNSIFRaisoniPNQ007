package com.tnsif.dayeleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {

		
		try {
			Scanner sc = new Scanner(System.in);
			
			int startIndex, endIndex;
			
			String message, str;
			
			System.out.println("Enter a message: ");
			message= sc.nextLine();
			
			System.out.println("Enter the start index and end index : ");
			startIndex = sc.nextInt();
		    endIndex = sc.nextInt();
		    
		    str= message.substring(startIndex, endIndex);
		    
		    System.out.println("The excracted message is : "+ str);
		    
		    sc.close();
		}
		catch(StringIndexOutOfBoundsException s)
		{
			System.err.println("Error! Invalid Index ");
		}
		
		catch(InputMismatchException i)
		{
			System.err.println("Error! Invalid Input ");
		}
		
		
	}
	


}
