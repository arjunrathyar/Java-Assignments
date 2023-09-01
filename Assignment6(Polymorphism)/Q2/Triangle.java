package com.nissan.method;

public class Triangle extends Figure{
	
	public Triangle(float dim1, float dim2) {
		super(dim1, dim2);
		// TODO Auto-generated constructor stub
	}
	
	public float area(){
		return dim1*dim2/2;
	}

}
