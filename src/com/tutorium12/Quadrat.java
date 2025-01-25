package com.tutorium12;

public class Quadrat extends Form {
	private double seitelaenge;

	/**
	 * @param seitelaenge
	 */
	public Quadrat(double seitelaenge) {
		this.seitelaenge = seitelaenge;
	}

	@Override
	public double berechneFlaeche() {
		// TODO Auto-generated method stub
		
		return seitelaenge * seitelaenge;
	}

	@Override
	public void gebeFlaecheAus() {
		// TODO Auto-generated method stub
		System.out.println("Flaeche: " + berechneFlaeche());
	}

}
