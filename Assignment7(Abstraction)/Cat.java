package com.nissan.model;

public class Cat extends Animals{
	
	@Override
	public void saySomething() {
		System.out.println("Cats Say Meoow");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("Cats Say Meoow Meoow");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Cats can't fly!!");
		
	}

	@Override
	public void walk(int noOfLegs) {
		// TODO Auto-generated method stub
		System.out.println("Cats walk with "+noOfLegs+" number of legs");
	}

}
