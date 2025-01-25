package com.tutorium13;

public class Fleisch extends Nahrungsmittel implements Essbar {

	/**
	 * @param name
	 * @param typ
	 * @param kalorien
	 */
	public Fleisch(String name, int kalorien) {
		super(name, "Fleisch", kalorien);
	}

	@Override
	public void essen() {
		// TODO Auto-generated method stub
		gebeAus();
		System.out.print(" wird gegessen.");
	}

}
