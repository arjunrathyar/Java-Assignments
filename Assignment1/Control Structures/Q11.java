package com.assignment2.app;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the passenger name: ");
		String passengerName = in.nextLine();
		System.out.println("Enter the train name: ");
		String trainName = in.nextLine();
		SeatReservation s1 = new SeatReservation(passengerName,trainName);
		System.out.println(s1.checkReservation());
	}

}
