package com.assignment2.app;

class Box2{
	int width,height,depth,vol;
	
	int volume(int width,int height,int depth){
		vol = width*height*depth;
		return vol;
	}
}

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box2 b1 = new Box2();
		Box2 b2 = new Box2();
		System.out.println("Volume of 1st Box: "+b1.volume(10, 20, 30));
		System.out.println("Volume of 2nd Box: "+b2.volume(30, 12, 78));

	}

}
