package com.tutorium14;

public class Wohnung extends Wohnobjekt {
	private String aktuellerMieter;
	
	public Wohnung(String stadt, double quadratmeter, double preis, String aktuellerMieter) {
		super(stadt, quadratmeter, preis);
		this.aktuellerMieter = aktuellerMieter;
	}

}
