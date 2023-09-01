package com.nissan.model;

public class Grad extends Student{
	
	//double grade = 75;
	
	boolean isPassed (double grade){
		if (grade>80){
			return true;
		}
		return false;
	}

	public String toString() {
		return "Grad [name=" + name + ", ID=" + ID + ", address=" + address
				+ ", grade=" + grade + ", age=" + age + ", pass status= " +isPassed(grade) +"]";
	}
	
	

}
