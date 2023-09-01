package com.nissan.model;

public class CustomerAccount {
	
	private long accNo;
	private String name, place ,accType;
	private int age;
	
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "CustomerAccount [accNo=" + accNo + ", name=" + name
				+ ", place=" + place + ", accType=" + accType + ", age=" + age
				+ "]";
	}
	
	

}
