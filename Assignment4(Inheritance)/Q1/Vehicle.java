package com.nissan.model;

public class Vehicle {

	private String bName = "Nissan";
	private String bColor = "White";
	
	public String getbColor() {
		return bColor;
	}

	public String getbName() {
		return bName;
	}

	public String brandName(){
		return getbName()+" - "+getbColor();
	}
}
