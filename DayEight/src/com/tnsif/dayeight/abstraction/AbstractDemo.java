package com.tnsif.dayeight.abstraction;

public class AbstractDemo {

	   private int data;
	
	
	public static void main(String[] args) {
		
		Square sq= new Square();
		Rectangle r1 = new Rectangle();
		
		sq.calArea();
		sq.show();
		
		r1.calArea();
		r1.show();
		
		
		Shape shape;
		shape= new Square(12.5f);
		
		shape.calArea();
		shape.show();
		
		
		
		
		
		
		
		

	}

}
