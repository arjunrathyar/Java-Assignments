package com.nissan.lib;

import org.springframework.stereotype.Component;

import com.nissan.model.IVehicle;

@Component
public class Tata implements IVehicle {

	@Override
	public void getVehicleName() {
		// TODO Auto-generated method stub
		System.out.println("Tata Cars");
		System.out.println("================================================");
		System.out.println("Harrier");
		System.out.println("Sierra");
		System.out.println("Safari");
		System.out.println("Nano");
		System.out.println("Hexa");
		System.out.println("Nexon");
		System.out.println("Punch");
		System.out.println("Altroz");
		System.out.println("Tiago");
	}

	@Override
	public String getBrandName() {
		// TODO Auto-generated method stub
		return "Tata";
	}



}
