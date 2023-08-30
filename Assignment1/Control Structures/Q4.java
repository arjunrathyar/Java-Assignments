package com.assignment2.app;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short month;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Month: ");
		month = in.nextShort();

		switch (month) {
		case 1:
			System.out.println("Winter Season");
			break;
		case 2:
			System.out.println("Winter Season");
			break;
		case 3:
			System.out.println("Spring  Season");
			break;
		case 4:
			System.out.println("Spring  Season");
			break;
		case 5:
			System.out.println("Spring  Season");
			break;
		case 6:
			System.out.println("Summer Season");
			break;
		case 7:
			System.out.println("Summer Season");
			break;
		case 8:
			System.out.println("Summer Season");
			break;
		case 9:
			System.out.println("Autumn Season");
			break;
		case 10:
			System.out.println("Autumn Season");
			break;
		case 11:
			System.out.println("Autumn Season");
			break;
		case 12:
			System.out.println("Winter Season");
			break;
		default : System.out.println("Wrong Choice");

		}

	}

}
