package com.assignment2.app;

import java.util.Scanner;

public class Q3 {
	
	public static void main(String[] args){
		
		short month;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Month: ");
		month = in.nextShort();
		
		if (month==1 || month==2 || month==12){
			System.out.println("Winter Season");
		}
		else if (month==3 || month==4 || month==5){
			System.out.println("Spring  Season");
		}
		else if (month==6 || month==7 || month==8){
			System.out.println("Summer Season");
		}
		else if (month==9 || month==10 || month==11){
			System.out.println("Autumn Season");
		}
				
				
		
		
	}

}
