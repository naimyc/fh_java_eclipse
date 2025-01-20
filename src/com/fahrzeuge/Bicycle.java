package com.fahrzeuge;

public class Bicycle implements Driveable {

	@Override
	public void drive(double distance) {
		// TODO Auto-generated method stub
		System.out.println("Das Fahrrad wurde " + distance + "gefahren.");
	}

}
