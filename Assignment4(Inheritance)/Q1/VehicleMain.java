package com.nissan.app;

import com.nissan.model.Car;
import com.nissan.model.Vehicle;

public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle obj = new Vehicle();
		System.out.println(obj.brandName());
		Car obj2 = new Car();
		System.out.println(obj2.brandName()+" - "+obj2.getbColor());
		System.out.println(obj2.brandName()+" - "+obj2.color());

	}

}
