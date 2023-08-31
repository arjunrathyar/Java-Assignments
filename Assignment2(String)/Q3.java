package com.assignment4.app;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 0;
		Scanner in = new Scanner(System.in);
		String finalString = null;

		System.out.print("Enter String : ");
		String s = in.nextLine();

		for (int i = s.length() / 2; i > 0; i--) {
			String prefix = s.substring(0, i);
			String suffix = s.substring(s.length() - i);

			if (prefix.equals(suffix)) {
				finalString = prefix;
				flag++;
				break;
			}
		}
		if (flag == 0)
			System.out.println("No common substring found.");
		else
			System.out.println("Longest common substring: " + finalString);
	}

}
