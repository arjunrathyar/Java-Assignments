package com.nissan.model;

public class Savings extends Account{
	
	float intRate = 4;
	
	double intCalc(){
		return (this.getPrinciple()*this.getTime()*intRate)/100;
	}

	public String toString() {
		return "Savings [intRate=" + intRate + ", userName=" + userName
				+ ", principle=" + principle + ", time=" + time + ", interest="
				+ intCalc() + "]";
	}
	
	

}
