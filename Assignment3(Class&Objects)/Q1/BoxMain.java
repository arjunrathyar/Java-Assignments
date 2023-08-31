package com.assignment3.app;

import java.util.Scanner;

public class BoxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in =new Scanner(System.in);
		
		Box obj = new Box();
		System.out.println("Depth: ");
		obj.setDepth(in.nextFloat());
		System.out.println("Height: ");
		obj.setHeight(in.nextFloat());
		System.out.println("Width: ");
		obj.setWidth(in.nextFloat());
		System.out.println("Vol of first Box: "+obj.getVol());
		
		
		Box obj2 = new Box();
		System.out.println("Depth: ");
		obj2.setDepth(in.nextFloat());
		System.out.println("Height: ");
		obj2.setHeight(in.nextFloat());
		System.out.println("Width: ");
		obj2.setWidth(in.nextFloat());
		System.out.println("Vol of Second Box: "+obj2.getVol());
	}

}
