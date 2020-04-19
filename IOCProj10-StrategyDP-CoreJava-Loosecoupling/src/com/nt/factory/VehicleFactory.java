package com.nt.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.nt.comps.Engine;
import com.nt.comps.Vehicle;

public class VehicleFactory {
	private static  Properties props;
	static{
		InputStream is=null;
	
		try {
		 //Locate properties file
			is=new FileInputStream("src/com/nt/commons/App.properties");
		 //Load properites file into java.util.Properties class object
		 props=new Properties();	
			props.load(is);
		}
		catch(FileNotFoundException fnf) {
			fnf.printStackTrace();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public  static  Vehicle getInstance() {
		Vehicle vehicle=null;
		Engine engg=null;
		try {
		//Load and Instantiate target class
		 vehicle=(Vehicle)Class.forName(props.getProperty("target.class")).newInstance();
		 //Load and Instantiate dependnet class
		 engg=(Engine)Class.forName(props.getProperty("dependent.class")).newInstance();
		 //set Dependent to target
		 vehicle.setEngine(engg);
		}
		catch(InstantiationException iae) {
			iae.printStackTrace();
		}
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return vehicle;
	}//method
}//class
