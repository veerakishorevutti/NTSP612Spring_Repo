package com.nt.factory;

import com.nt.comps.DieselEngine;
import com.nt.comps.Engine;
import com.nt.comps.PetrolEngine;
import com.nt.comps.Vehicle;

public class VehicleFactory {
	
	public  static  Vehicle getInstance(String type) {
		Vehicle vehicle=null;
		Engine engg=null;
		//create Engine object based engine type
		if(type.equalsIgnoreCase("petrol")) {
			engg=new PetrolEngine();
		}
		else if(type.equalsIgnoreCase("diesel")) {
			engg=new DieselEngine();
		}
		else
			throw new IllegalArgumentException("Invalid engine type");
		//create tagert class obj
		vehicle=new Vehicle();
		//set Engine to target
		vehicle.setEngine(engg);
		return vehicle;
	}//method
}//class
