package com.tutorium13;

public class Obst extends Nahrungsmittel implements Essbar {
	
	/**
	 * @param name
	 * @param typ
	 * @param kalorien
	 */
	public Obst(String name, int kalorien) {
		super(name, "Obst", kalorien);
	}

	@Override
	public void essen() {
		// TODO Auto-generated method stub
		gebeAus();
		System.out.print(" wird gegessen.\n\n");
	}

}
