package com.assignment3.app;

import java.util.Scanner;

public class StaffMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char choice = 'n';
		do {
			Scanner in = new Scanner(System.in);
			System.out.println("Choose From the Options");
			System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("1. Add Staff");
			System.out.println("2. Search Staff");
			System.out.println("3. Delete Staff");
			System.out.println("4. Display all Staff");
			System.out.println("Press any other key to exit!!");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			System.out.println("Enter your choice: ");
			int inp = in.nextInt();

			StaffLibrary obj = new StaffLibrary();

			if (inp == 1) {
				obj.addStaff();
			}

			else if (inp == 2) {
				System.out.println("Enter Name to Search: ");
				String searchName = in.next();
				int index = obj.searchStaff(searchName);
				if (index != -1) {
					obj.displayStaff(index);
				}
			}

			else if (inp == 3) {
				System.out.println("Enter Name to Delete: ");
				String searchName = in.next();
				obj.deleteStaff(searchName);

			}

			else if (inp == 4) {
				obj.displayStaffs();

			}

			else {
				System.out.println("Wrong Choice!!     Exiting!!");
				System.exit(0);
			}
			
			
			System.out.println("\nDo you wish to continue??");
			choice = in.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');

	}

}
