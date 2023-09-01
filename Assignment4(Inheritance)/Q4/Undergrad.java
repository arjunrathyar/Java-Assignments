package com.nissan.model;

public class Undergrad extends Student {
	
	//double grade = 75;
	
	boolean isPassed (double grade){
		if (grade>70){
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Undergrad [name=" + name + ", ID=" + ID + ", address="
				+ address + ", grade=" + grade + ", age=" + age + ", pass status= " +isPassed(grade) +"]";
	}
	
	

}
