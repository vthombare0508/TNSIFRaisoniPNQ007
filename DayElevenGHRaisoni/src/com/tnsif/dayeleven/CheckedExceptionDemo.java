package com.tnsif.dayeleven;

import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args)  {
		
		try {
			String str= CheckedException.acceptText(); // reads line from console
			
			System.out.println("Your string is : "+ str);
			
		} catch (IOException e) {
		
			System.err.println("An error occured while reading input: "+ e.getMessage());
		}

	}

}
