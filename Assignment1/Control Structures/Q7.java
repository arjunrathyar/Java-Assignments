package com.assignment2.app;

class Box{
	int width,height,depth,vol;
	
	int volume(){
		vol = width*height*depth;
		return vol;
	}
}

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b1 = new Box();
		b1.depth = 10;
		b1.width = 20;
		b1.height = 40;
		
		Box b2 = new Box();
		b2.depth = 27;
		b2.width = 32;
		b2.height = 19;
		
		System.out.println("Volume of 1st Box: "+b1.volume());
		System.out.println("Volume of 2nd Box: "+b2.volume());

	}

}
