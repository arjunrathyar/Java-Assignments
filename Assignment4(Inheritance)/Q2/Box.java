package com.nissan.model;

public class Box {

	float width, height, depth;
	
	public Box(float width, float height, float depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public float volume(){
		return width*height*depth;
	}
	
}
