package com.assignment4.app;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String out = "";

		System.out.print("Enter String : ");
		String s = in.nextLine();

		int index = s.indexOf('#');

		char[] string = s.toCharArray();

		for (int i = index - 1; i < string.length - 3; i++)
			string[i] = string[i + 3];
		for (int i = 0; i < string.length - 3; i++)
			out += string[i];

		System.out.println("Result: " + out);

	}

}
