package com.assignment.app;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Numbers: ");
		number = in.nextInt();

		String combined = "";
		int rem = 0;
		int updatedNo = number;

		while(updatedNo>0){
			rem = updatedNo % 10;
			combined += rem;
			updatedNo = updatedNo / 10;			
		}
		
		System.out.println("Reversed Number: " + combined);

	}
}
