package com.tnsif.dayten;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {

		// declares an array 
		Student[] arr;
		
		//allocating memory for 5 objects of type student
		arr = new Student[5];
		
		//initialize the elements of array
		arr[0] = new Student(1, "Soham");
		arr[1] = new Student(2, "Lisha");
		arr[2] = new Student(3, "Kirti");
		arr[3] = new Student(4, "Omkar");
		arr[4] = new Student(5, "Madhu");
		
		// accessing the elements of the specified array
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Element at "+i+" : "+ arr[6].getRollno()+" "+ arr[6].getName());
		}
		
		
		
		
	}

}
