package com.tnsif.dayfifteen.builtinobjects;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> animals = new Vector<String>();
		
		animals.add("Dog");
		animals.add("Camel");
		animals.add("Cat");
		animals.add(null);
		animals.add(null);
		
		System.out.println("Initial Vector : "+ animals);
		
		// Using get()
		System.out.println("Element at index at 2 : "+ animals.get(2));
		
		// Using Iterator()
		
		Iterator<String> iterate = animals.iterator();
		System.out.println("Vector : ");
		while(iterate.hasNext())
		{
			System.out.print(iterate.next());
			System.out.print(" , ");		
		}
		
		//Using remove
		
		String element = animals.remove(2);
		System.out.println("Removed Element is :"+ element);
		
		System.out.println("New Vector : "+ animals);
		
		// using clear()
		animals.clear();
		System.out.println("Vector after clear() : "+ animals);
		
			
		
	}

}
