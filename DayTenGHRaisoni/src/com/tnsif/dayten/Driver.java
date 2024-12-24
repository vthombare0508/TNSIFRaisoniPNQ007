package com.tnsif.dayten;

public class Driver {

	public static void main(String[] args) {

		 int n = 10;
		 int a[];  //declaration
		 a = new int[n]; //instantiation
		 
		 // displaying the array
		 ArrayOperations.printArray(a);
		 
		 // assigning values in array a
		 
		 for(int i=0; i<a.length; i++)
		 {
			 a[i]= 5*i;
		 }
		 
		 ArrayOperations.printArray(a);
		 
		 
		 int b[]= {10,20,30,40,50,60};
		 
		 ArrayOperations.printArray(b);
		 
		 //calling variable argument function
		 System.out.println("Sum of Array element is : "+ ArrayOperations.getSum(b));
		 System.out.println("Sum of Array element is : "+ ArrayOperations.getSum(2,7));
		 
		 b[2]=999; // assigning single element
		 
		// b[20]=10;
		 ArrayOperations.printArray(b);
		 
		 // Display total no. of odd and even numbers in array b
		 
		 System.out.println("Odd Numbers : "+ ArrayOperations.getOddCount(b) + "\t Even Numbers : "+
		       ArrayOperations.getEvenCount(b));
		 
		 
		 
	}

}
