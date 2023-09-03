package com.faith.propel.java.camp4;

public class Square implements Shape {

	private float side;

	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public float area() {
		return this.side * this.side;
	}

}
