package com.tnsif.dayseven.overriding;

public class ShapeDemo {

	public static void main(String[] args) {
		
		// create an array of shape class
		Shape[] shapes = new Shape[2];
		
		// instantiate objects of circle , square
		
		shapes[0]= new Circle(5.0);
		shapes[1]= new Square(6.0);
		
		// demonstrate polymorphism by calling draw and erase methods
		
		for(Shape sh:shapes)
		{
			sh.draw();
			sh.erase();
			System.out.println("---------------------------------------------");
		}
		
		Shape s = new Shape();
		s.draw();
		
		Circle c = new Circle(2.2);
		c.draw();
		
	}

}
