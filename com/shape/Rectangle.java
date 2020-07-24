package com.shape;

public class Rectangle implements Polygon {
	
	float length;
	float breadth;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public void calcPeri(float b, float c) {
		this.length = b;
		this.breadth= c;
		System.out.println("perimeter of rectangle :"+ 2*(b+c));
	}
	@Override
	public void calcArea(float Side) {
		// TODO Auto-generated method stub
		
	}

}
