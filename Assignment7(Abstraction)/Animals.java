package com.nissan.model;

public abstract class Animals {

	private int noOfLegs;
	private String color;

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract void saySomething();

	public abstract void cry();

	public abstract void fly();

	public abstract void walk(int noOfLegs);

}
