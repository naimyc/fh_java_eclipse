package com.tutorium12;

public class Rechteck extends Form {
	
	private double laenge, breite;

	/**
	 * @param laenge
	 * @param breite
	 */
	public Rechteck(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
	}

	@Override
	public double berechneFlaeche() {
		// TODO Auto-generated method stub
		return laenge * breite;
	}

	@Override
	public void gebeFlaecheAus() {
		// TODO Auto-generated method stub
		System.out.println("Flaeche: " + berechneFlaeche());
	}

}
