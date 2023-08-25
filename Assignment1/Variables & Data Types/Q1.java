package com.assignment.app;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 1st No: ");
		num1 = in.nextInt();
		System.out.println("Enter 2nd No: ");
		num2 = in.nextInt();
		
		System.out.println("Before Swapping, the numbers are: "+num1+","+num2);
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("After Swapping, the numbers are: "+num1+","+num2);

	}

}
