package com.assignment.app;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double temperature;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the temperature: ");
		temperature = in.nextDouble();

		System.out.println("Temperature in Celsius: " + (temperature - 32) * 5
				/ 9);

	}

}
