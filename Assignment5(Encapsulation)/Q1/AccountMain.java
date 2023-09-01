package com.nissan.app;

import java.util.Scanner;

import com.nissan.model.FixedDeposit;
import com.nissan.model.Savings;

public class AccountMain {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Savings obj = new Savings();
		FixedDeposit obj2 = new FixedDeposit();
		
		System.out.println("Enter the type (1 for Savings,2 for Fixed Deposit): ");
		int inp = in.nextInt();
		
		if (inp==1){
			System.out.println("Enter Name: ");
			obj.setUserName(in.next());
			System.out.println("Enter Principle: ");
			obj.setPrinciple(Double.parseDouble(in.next()));
			System.out.println("Enter Time: ");
			obj.setTime(Float.parseFloat(in.next()));
			System.out.println(obj.toString());
		}
		else if(inp==2){
			System.out.println("Enter Name: ");
			obj2.setUserName(in.next());
			System.out.println("Enter Principle: ");
			obj2.setPrinciple(Double.parseDouble(in.next()));
			System.out.println("Enter Time: ");
			obj2.setTime(Float.parseFloat(in.next()));
			System.out.println(obj2.toString());
		}	
		
	}

}
