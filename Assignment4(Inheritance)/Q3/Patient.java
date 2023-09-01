package com.nissan.model;

import java.time.LocalDate;

public class Patient {

	int patientNumber;
	String hospital, address;
	LocalDate doj;
	double medicalFees;

	Money m = new Money();
	
	public Patient(int patientNumber, String hospital, String address, LocalDate doj,int dateDiff) {
		super();
		this.patientNumber = patientNumber;
		this.hospital = hospital;
		this.address = address;
		this.doj = doj;
		this.medicalFees = (m.getBasicFee()+m.getTax())*dateDiff;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public String toString() {
		return "Patient = [patientNumber=" + patientNumber + ", hospital="
				+ hospital + ", address=" + address + ", doj=" + doj
				+ ", medicalFees=" + medicalFees + "]";
	}
	

}
