package com.assignment2.app;

import java.util.Scanner;

class Data {
	String[] countryName = new String[] { "China", "US", "Japan" };
	String[] countryLanguage = new String[] { "Chinese", "English", "Japanese" };
	String[] customerID = new String[] { "C101", "C102", "C103" };
	String[] billingDate = new String[] { "12-09-2022", "13-09-2022",
			"14-09-2022" };
	double[] amountOutstanding = new double[] { 200.50, 250, 100 };

	int flag = 0;

	void getDetails(String id) {
		for (int i = 0; i <= customerID.length - 1; i++) {
			if (id.contains(customerID[i])) {
				System.out
						.println("===================CUSTOMER DETAILS===================");
				System.out.println("Customer ID: " + customerID[i]);
				System.out.println("Country Name: " + countryName[i]);
				System.out.println("Country Language: " + countryLanguage[i]);
				System.out.println("Billing Date: " + billingDate[i]);
				System.out.println("Amount Outstanding: "
						+ amountOutstanding[i]);
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Invalid Details!!");
		}
	}

}

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cID;

		System.out.println("Enter the Customer ID: ");
		Scanner in = new Scanner(System.in);
		cID = in.nextLine();
		new Data().getDetails(cID);
	}

}
