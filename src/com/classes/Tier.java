package com.classes;

public class Tier {
	private String artennamen;
	private double groesse, gewicht;

	public String getArtennamen() {
		return artennamen;
	}

	public void setArtennamen(String artennamen) {
		this.artennamen = artennamen;
	}

	public double getGroesse() {
		return groesse;
	}

	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public void ausgabe() {
		System.out.printf("Art: %s\nGroesse: %.2f\nGewicht: %.2f", artennamen, groesse, gewicht);
	}

	public Tier(String artennamen, double groesse, double gewicht) {
		super();
		this.artennamen = artennamen;
		this.groesse = groesse;
		this.gewicht = gewicht;
	}

}
