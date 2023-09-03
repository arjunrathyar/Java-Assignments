package com.nissan.model;

public class Dog extends Animals{
	
	@Override
	public void saySomething() {
		System.out.println("Dogs Say Bow Wow");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("Dogs Say Bow Wow");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Dogs can't fly!!");
	}

	@Override
	public void walk(int noOfLegs) {
		// TODO Auto-generated method stub
		System.out.println("Dogs walk with "+noOfLegs+" number of legs");
	}


}
