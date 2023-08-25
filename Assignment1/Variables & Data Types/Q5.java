package com.assignment.app;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 1st No: ");
		num1 = in.nextInt();
		System.out.println("Enter 2nd No: ");
		num2 = in.nextInt();
		
		System.out.println("Quotient: "+num1/num2+","+" Remainder: "+num1%num2);

	}

}
