package com.nissan.model;

public class BoxWeight extends Box{
	
	float weight;

	public BoxWeight(float width, float height, float depth, float weight) {
		super(width, height, depth);
		this.weight = weight;
	}

	public String toString() {
		return "[Volume=" + super.volume() + ", Weight=" + weight+ "]";
	}
	
	

}
