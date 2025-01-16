package com.tnsif.dayeleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		
		System.out.println("I am in main method");
		
		int numberOne, numberTwo, numberThree;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			try
			{
				System.out.println("Enter First Number: ");
				numberOne = sc.nextInt();
				System.out.println("Enter Second Number: ");
				numberTwo = sc.nextInt();
				numberThree= numberOne/numberTwo;
				System.out.println("Division is : "+ numberThree);
			}
			catch(ArithmeticException | InputMismatchException a)
			{
				System.out.println("Exception caught : "+ a.getMessage());
			}
//			catch(InputMismatchException i)
//			{
//				System.out.println("Invalid Input, Please enter integers only");
//				sc.nextLine();
//			}
			catch(Exception e)
			{
				System.out.println("Exception caught : "+ e.getMessage());
			}
		}

	}

}
