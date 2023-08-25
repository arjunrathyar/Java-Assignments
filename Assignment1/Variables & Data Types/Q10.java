package com.assignment.app;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Number: ");
		number = in.nextInt();

		int sum = 0;
		int rem = 0;
		int updatedNo = number;

		while(updatedNo>0){
			rem = updatedNo % 10;
			sum += rem;
			updatedNo = updatedNo / 10;			
		}
		
		System.out.println("Sum of Digits: " + sum);

	}

}
