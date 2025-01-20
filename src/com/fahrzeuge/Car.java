package com.fahrzeuge;

public class Car implements Driveable {
	private double fuelLevel, fuelConsumption;
	
	
	public Car(double fuelLevel, double fuelConsumption) {
		super();
		this.fuelLevel = fuelLevel;
		this.fuelConsumption = fuelConsumption;
	}


	@Override
	public void drive(double distance) {
		// TODO Auto-generated method stub
		fuelLevel -= fuelConsumption / distance;
		System.out.printf("Das Auto wurde " + distance + " gefahren.\nTank Level: "+ fuelLevel);
	}

}
