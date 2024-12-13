package com.tnsif.daysix.staticblockmethod;

public class MyClass {
	
	private int section;
	private static int srNo;
	
	static
	{
		System.out.println("-----------Staic block data-------------------");
		srNo= 1000;
		
	}
	
	public void data()
	{
		System.out.println("---------- Non Static Method----------");
	}
	
	
	MyClass(){
		System.out.println("--------Default Constructor-------------------");
		srNo++;
		section++;
	}


	@Override
	public String toString() {
		return "MyClass [section=" + section + "]";
	}
	
	static void display()
	{
		System.out.println("Serial No "+ srNo);
	}
	
	

}
