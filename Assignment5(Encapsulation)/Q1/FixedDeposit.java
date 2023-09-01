package com.nissan.model;

public class FixedDeposit extends Account{
	
	float intRate = 11;
	
	double intCalc(){
		return (this.getPrinciple()*this.getTime()*intRate)/100;
	}

	public String toString() {
		return "FixedDeposit [intRate=" + intRate + ", userName=" + userName
				+ ", principle=" + principle + ", time=" + time + ", interest="
				+ intCalc() + "]";
	}
	
	

}
