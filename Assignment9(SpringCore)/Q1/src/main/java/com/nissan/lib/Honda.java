package com.nissan.lib;

import org.springframework.stereotype.Component;

import com.nissan.model.IVehicle;

@Component
public class Honda implements IVehicle {

	@Override
	public void getVehicleName() {
		// TODO Auto-generated method stub
		System.out.println("Honda Cars");
		System.out.println("================================================");
		System.out.println("Civic Type R");
		System.out.println("Civic");
		System.out.println("City");
		System.out.println("Elevate");
		System.out.println("Amaze");
		System.out.println("BR-V");
		System.out.println("CR-V");
		System.out.println("WR-V");
		System.out.println("Jazz");

	}

	@Override
	public String getBrandName() {
		// TODO Auto-generated method stub
		return ("Honda");

	}

}
