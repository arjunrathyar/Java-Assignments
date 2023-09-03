package com.nissan.model;

public class Goat extends Animals{

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub
		System.out.println("Goats Say Meh Meh");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("Goats Say Meh Meh");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Goats can't fly!!");
	}

	@Override
	public void walk(int noOfLegs) {
		// TODO Auto-generated method stub
		System.out.println("Goats walk with "+noOfLegs+" number of legs");
		
	}

}
