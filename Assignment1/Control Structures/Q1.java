package com.assignment2.app;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double units, cost = 0, category, readingRange;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter Category(1 for Domestic,2 for Industry): ");
		category = Integer.parseInt(in.nextLine());
		System.out.println("Enter the Units: ");
		units = Double.parseDouble(in.nextLine());
		
		
		
		if (category==1){
			if (units>=0 && units<100){
				cost = units*1;
			}
			if (units>=100 && units<200){
				cost = units*1.5;
			}
			if (units >= 200 && units < 500) {
				cost = units*2;
			}
			if (units>=500){
				cost = units*5;
			}			
		}
		else{
			cost = units*10;
		}
		
		System.out.println("Total Cost: "+cost);
		

	}

}
