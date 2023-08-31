package com.assignment3.app;

public class Box {
	
	float width,height,depth;

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}
	
	float getVol(){
		return this.width*this.depth*this.height;
	}
	

}
