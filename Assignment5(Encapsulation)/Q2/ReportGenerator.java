package com.nissan.app;

import com.nissan.model.Item;

public class ReportGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item obj = new Item();
		obj.setItem1("Bumper");
		obj.setItem2("Spoiler");
		obj.setItem3("Cladding");
		obj.setItem4("Spark Plugs");
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("		Items");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println(obj.getItem1());
		System.out.println(obj.getItem2());
		System.out.println(obj.getItem3());
		System.out.println(obj.getItem4());

	}

}
