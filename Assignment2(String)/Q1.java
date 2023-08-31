package com.assignment4.app;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = in.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++){ 
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				sum+=(str.charAt(i)-'0');
			}
		}
		System.out.println("Sum: " +sum );

	}

}
