package com.tnsif.daynine.Stringdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		String s1 = new String("TNSIF");
		
		// StringBuffer length vs capacity
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer);
		
		System.out.println(buffer.length()); // no of charaters
		System.out.println("Capacity : "+ buffer.capacity()); // no of charaters + 16 
		
		
		String longstr = "Hello "+" world ";
		System.out.println(longstr);
		
		//appending and inserting into StringBuffer
		
		String s;
		
		int a = 42;
		buffer = new StringBuffer(40);
		
		s = buffer.append("a = ").append(a).append("!").toString();
		System.out.println(buffer);
		System.out.println(s);
		
		buffer = new StringBuffer("I Java !");
		buffer.insert(2, "like ");
		System.out.println(buffer);
		
		buffer.delete(2,6 );
		System.out.println(buffer);
		
		buffer.reverse();
		System.out.println(buffer);
		

	}

}
