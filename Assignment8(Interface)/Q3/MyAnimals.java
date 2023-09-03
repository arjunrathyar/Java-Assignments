package com.faith.propel.java.camp4;

public class MyAnimals extends Animals implements Imammals{

	private int BodyTemp;


	public int getBodyTemp() {
		return BodyTemp;
	}

	public void setBodyTemp(int bodyTemp) {
		BodyTemp = bodyTemp;
	}

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub
		System.out.println("Animal :(");
	}

	@Override
	public int GetBodyTemp(String temp) {
		// TODO Auto-generated method stub
		return Integer.parseInt(temp);
	}

}
