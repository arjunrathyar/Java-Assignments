package com.faith.propel.java.camp4;

public class Rectangle implements Shape {

	private float length;
	private float breadth;

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return this.length * this.breadth;
	}

}
