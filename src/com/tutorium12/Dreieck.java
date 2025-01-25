package com.tutorium12;

public class Dreieck extends Form {
	private double g, h;
	
	/**
	 * @param g
	 * @param h
	 */
	public Dreieck(double g, double h) {
		this.g = g;
		this.h = h;
	}

	@Override
	public double berechneFlaeche() {
		// TODO Auto-generated method stub
		return 0.5 * g * h;
	}

	@Override
	public void gebeFlaecheAus() {
		// TODO Auto-generated method stub
		System.out.println("Flaeche: " + berechneFlaeche());
	}

}
