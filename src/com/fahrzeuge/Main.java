package com.fahrzeuge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driveable[] d = new Driveable[3];
		
		Car a = new Car(300, 30);
		Car a2 = new Car(500, 30);

		Bicycle b = new Bicycle();
		
		a.drive(30);
		
		d[0] =  a;
		d[1] = b;
		d[2] = a2;
		
	}

}
