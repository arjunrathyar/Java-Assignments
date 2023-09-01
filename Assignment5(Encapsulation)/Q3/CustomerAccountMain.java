package com.nissan.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.nissan.model.CustomerAccount;

public class CustomerAccountMain {
	
	static ArrayList<CustomerAccount> accountsArr = new ArrayList<CustomerAccount>(5); 

	public static void main(String[] args) {
		int opt;
		do {
				Scanner in = new Scanner(System.in);
				System.out.println("Choose an option");
				System.out.println("1-Add Customers");
				System.out.println("2-List Cutomers");
				System.out.println("3-Search");
				System.out.println("4-Exit");
				System.out.print("Option : ");
				opt = in.nextInt();
				if(opt==1) {
					System.out.println("Enter the details of 5 customers");
					for(int i=0;i<5;i++) {
						System.out.print("Enter the Account number : ");
						long accNo = in.nextLong();
						System.out.print("Enter the customer name : ");
						String name = in.next();
						System.out.print("Enter the customer age : ");
						int age = in.nextInt();
						System.out.print("Enter the customer place : ");
						String place = in.next();
						System.out.print("Enter the customer Account type : ");
						String accType = in.next();
						CustomerAccount c = new CustomerAccount();
						c.setAccNo(accNo);
						c.setName(name);
						c.setAge(age);
						c.setPlace(place);
						c.setAccType(accType);
						accountsArr.add(c);
					}
					System.out.println("Details entered ....");
				}
				else if (opt==2) {
					for(int i=0;i<accountsArr.size();i++)
						System.out.println(accountsArr.get(i).toString()+"\n");
				}
				else if (opt==3) {
					int flag=0;
					System.out.print("Enter the account no : ");
					long tempAccNo = in.nextLong();
					for(int i=0;i<accountsArr.size();i++) {
						if(accountsArr.get(i).getAccNo()==tempAccNo){
							System.out.println(accountsArr.get(i).toString());
							flag=1;
							break;
						}
					}
					if(flag==0)
						System.out.println("Record not found...");
				}
		}while(opt!=4);

	}

}
