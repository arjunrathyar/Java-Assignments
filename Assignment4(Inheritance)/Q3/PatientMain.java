package com.nissan.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.nissan.model.Patient;

public class PatientMain {

	public static void main(String[] args){
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
		
		int patientNumber = 101;
		String hospital = "Kims", address = "Kazhakkuttam";
		LocalDate dateObj1 = LocalDate.of(2017, 1, 13);
		
		  
		LocalDate dateObj = LocalDate.now();
        
        String date = dateObj.format(formatter);
        String date2 = dateObj1.format(formatter);
		
        int diff = Integer.parseInt(date)-Integer.parseInt(date2);
        
		Patient obj2 = new Patient(patientNumber, hospital, address, dateObj1, diff);
        
        System.out.println(obj2.toString());
		
	}
	
}
