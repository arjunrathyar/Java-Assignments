package com.nissan.app;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nissan.model.IVehicle;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		ClassPathXmlApplicationContext iocContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		IVehicle car1 = iocContext.getBean("honda", IVehicle.class);
		IVehicle car2 = iocContext.getBean("tata", IVehicle.class);

		int choice = 0;
		char choice2 = 'y';
		
		while (true) {
			if (choice2!='y'){
				System.exit(0);
			}
			System.out.println("Enter your choice to see the models (1 for " + car1.getBrandName() + " and 2 for "
					+ car2.getBrandName() + "): ");
			choice = Integer.parseInt(in.next());
			switch (choice) {
			case 1:
				car1.getVehicleName();
				System.out.println();
				System.out.println("Do you wish to continue?(y/n): ");
				choice2 = in.next().charAt(0);	
				break;
			case 2:
				car2.getVehicleName();
				System.out.println();
				System.out.println("Do you wish to continue?(y/n): ");
				choice2 = in.next().charAt(0);
				break;
			default:
				System.out.println("Invalid Choice!!");
				break;
			}

		}

	}

}
