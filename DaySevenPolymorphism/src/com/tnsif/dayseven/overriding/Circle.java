package com.tnsif.dayseven.overriding;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle(double radius)
	{
		this.radius= radius;
	}
	
	// override draw method for circle
	@Override
	public void draw()
	{
		System.out.println("Drawing a circle with radius "+ radius);
	}
	
	// override erase method for circle
	
	@Override
	public void erase()
	{
		System.out.println("Erasing a circle with radius "+radius);
	}
	
	public void color()
	{
		
	}
	
	
	
	
}
