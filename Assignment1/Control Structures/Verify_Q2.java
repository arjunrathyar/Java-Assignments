package com.assignment2.app;

import java.util.Scanner;

public class Verify_Q2 {

	int y;
	Verify_Q2(){
		y = 9999;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		Verify_Q2 obj = new Verify_Q2();
		
		int userInput;
		System.out.println("Enter the PIN: ");
		userInput = Integer.parseInt(in.nextLine());
		
		if (userInput==obj.y){
			System.out.println("PIN is Correct");
		}
		else{
			System.out.println("PIN is Incorrect");
		}

	}

}
