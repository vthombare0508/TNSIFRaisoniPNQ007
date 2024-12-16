package com.tnsif.dayseven.overriding;

public class Square extends Shape{

	private double side;
	
	public Square(double side)
	{
		this.side=side;
	}
	
	
	// Override draw method for square
	@Override
	public void draw()
	{
		System.out.println("Drawing a square with side "+ side);
	}
	
	
	// Override erase method for square
	
	@Override
	public void erase()
	{
		System.out.println("erasing a square with side : "+ side);
	}
	
	
	
	
	
	
}
