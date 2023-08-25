package com.assignment.app;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float distance;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Distance: ");
		distance = in.nextInt();
		
		System.out.println("------------------------------------------DISTANCE CHART------------------------------------------");
		System.out.println("Meters: "+distance*1000);
		System.out.println("Feet: "+distance*3280);
		System.out.println("Inches: "+distance*39370);
		System.out.println("Centimeters: "+distance*100000);
		

	}

}
