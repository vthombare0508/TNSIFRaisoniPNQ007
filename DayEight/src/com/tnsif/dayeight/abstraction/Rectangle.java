package com.tnsif.dayeight.abstraction;

public class Rectangle extends Shape {
     float width, height;
	
	public Rectangle() {
		
		this.height=5.0f;
		this.width=2.0f;
	}



	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}



	@Override
	void calArea() {
		
		area = width*height;
	}
	
	

}
