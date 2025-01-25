package com.tutorium12;

public class Kreis extends Form {
	private double radius;

	/**
	 * @param radius
	 */
	public Kreis(double radius) {
		this.radius = radius;
	}

	@Override
	public double berechneFlaeche() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

	@Override
	public void gebeFlaecheAus() {
		// TODO Auto-generated method stub
		System.out.println("Flaeche: "+ berechneFlaeche());
	}

}
