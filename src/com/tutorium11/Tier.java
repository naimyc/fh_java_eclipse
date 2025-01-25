package com.tutorium11;

public class Tier {
	private String artenname;
	private double groesse, gewicht;
	
	/**
	 * @param artenname
	 * @param groesse
	 * @param gewicht
	 */
	public Tier(String artenname, double groesse, double gewicht) {
		this.artenname = artenname;
		this.groesse = groesse;
		this.gewicht = gewicht;
	}
	
	public void macheGeraesch() {
		System.out.println(" macht ein Geräusch!");
	}
	public void ausgabe() {
		System.out.println("Ausgabe: ");
	}

	public String getArtenname() {
		return artenname;
	}

	public double getGroesse() {
		return groesse;
	}

	public double getGewicht() {
		return gewicht;
	}
}
