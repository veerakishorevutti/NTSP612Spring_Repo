package com.nt.test;

import com.nt.comps.Vehicle;
import com.nt.factory.VehicleFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Vehicle vehicle=null;
		//get Vehicle class object
		vehicle=VehicleFactory.getInstance("diesel");
		//invoke method
		vehicle.jounery("hyd","goa");
	}

}
