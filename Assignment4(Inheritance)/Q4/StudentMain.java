package com.nissan.app;

import com.nissan.model.Grad;
import com.nissan.model.Undergrad;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grad obj = new Grad();
		obj.setID("101");
		obj.setName("Ramu");
		obj.setAge(25);
		obj.setAddress("TVM");
		obj.setGrade(81);
		
		
		Undergrad obj2 = new Undergrad();
		obj2.setID("101");
		obj2.setName("Rahul");
		obj2.setAge(19);
		obj2.setAddress("TVM");
		obj2.setGrade(71);
		
		System.out.println(obj2.toString());
		System.out.println(obj.toString());
		
	}

}
