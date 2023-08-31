package com.assignment3.app;

public class Account {
	
	static double balance;
	
	public static double getBalance() {
		return balance;
	}

	public static void setBalance(double balance) {
		Account.balance = balance;
	}

	double deposit(double amount){
		Account.setBalance(Account.getBalance()+amount);
		return balance;
	}
	
	double withdraw(double amount){
		Account.setBalance(Account.getBalance()-amount);
		return balance;		
	}
	
	
	
	

}
