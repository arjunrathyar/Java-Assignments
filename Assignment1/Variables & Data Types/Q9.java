package com.assignment.app;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		float basicSalary;
		
		System.out.println("Basic Salary: ");
		basicSalary = in.nextFloat();
		
		float dAllowence = (float) (basicSalary*0.4);
		float hraAllowence = (float) (basicSalary*0.2);
		float totalSalary;
		
		totalSalary = basicSalary+hraAllowence+dAllowence;
		
		System.out.println("Total Salary: "+totalSalary);

	}

}
