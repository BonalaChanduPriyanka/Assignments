package com.shape;

public class Square implements Polygon {
	
	float Side;

	public Square() {
		// TODO Auto-generated constructor stub
	}
	public void calcArea(float a ) {
		this.Side = a*a;
		System.out.println("area of square :"+(a*a));
	}
	@Override
	public void calcPeri(float length, float breadth) {
		// TODO Auto-generated method stub
		
	}

}
