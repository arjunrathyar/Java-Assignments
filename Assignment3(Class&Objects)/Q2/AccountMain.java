package com.assignment3.app;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args){
		
		Account acc = new Account();
		//acc.setBalance(1000);
		//System.out.println(acc.deposit(200));
		//System.out.println(acc.withdraw(900));
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Acc. Bal: ");
		acc.setBalance(in.nextDouble());
		
		char choice='n';
		do{
			//Scanner in = new Scanner(System.in);
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			int inp = in.nextInt();
			if(inp==1){
				System.out.println("Amount to Withdraw: ");
				acc.withdraw(in.nextDouble());
			}
			else if(inp==2){
				System.out.println("Amount to Deposit: ");
				acc.deposit(in.nextDouble());
			}
			else if(inp==3){
				System.out.println("Account Balance: "+acc.getBalance());
			}
			else{
				System.exit(0);
			}
			System.out.println("Do you wish to continue? ");
			choice = in.next().charAt(0);
		}
		while(choice=='y'||choice=='Y');
		
		
	}
	
}
