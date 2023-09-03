package com.nissan.model;

public class Crow extends Animals{

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub
		System.out.println("Crows Say Kaa Kaa");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("Crows Say Kaa Kaa");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Crows can fly over certain meters!!");
	}

	@Override
	public void walk(int noOfLegs) {
		// TODO Auto-generated method stub
		System.out.println("Crows walk with "+noOfLegs+" number of legs");
	}

}
