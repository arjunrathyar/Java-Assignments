package com.nissan.app;

import com.nissan.model.BoxWeight;

public class BoxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoxWeight obj1 = new BoxWeight(10, 7, 8, 50);
		BoxWeight obj2 = new BoxWeight(20, 3, 32, 10);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());

	}

}
