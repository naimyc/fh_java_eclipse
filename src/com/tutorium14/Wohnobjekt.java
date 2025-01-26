package com.tutorium14;

abstract public class Wohnobjekt {
	
	private String stadt;
	private double quadratmeter, preis;
	
	/**
	 * @param stadt
	 * @param quadratmeter
	 * @param preis
	 */
	public Wohnobjekt(String stadt, double quadratmeter, double preis) {
		this.stadt = stadt;
		this.quadratmeter = quadratmeter;
		this.preis = preis;
	}

	public String getStadt() {
		return stadt;
	}

	public double getQuadratmeter() {
		return quadratmeter;
	}

	public double getPreis() {
		return preis;
	}
	
	

}
