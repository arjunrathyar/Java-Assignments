package com.nissan.model;

public class Chicken extends Animals{

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub
		System.out.println("Chickens Say Kokkarakkooo Kokkarakkooo");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("Chickens Say Kokkarakkooo Kokkarakkooo");		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Chickens seldom fly!!");
	}

	@Override
	public void walk(int noOfLegs) {
		// TODO Auto-generated method stub
		System.out.println("Chickens walk with "+noOfLegs+" number of legs");
	}

}
