package com.tutorium14;

public class Wohngemeinschaft extends Wohnobjekt {
	
	private int anzahlPersonen;
	private String[] bewohner;
	
	/**
	 * @param stadt
	 * @param quadratmeter
	 * @param preis
	 * @param anzahlPersonen
	 * @param bewohner
	 */
	public Wohngemeinschaft(String stadt, double quadratmeter, double preis, int anzahlPersonen, String[] bewohner) {
		super(stadt, quadratmeter, preis);
		this.anzahlPersonen = anzahlPersonen;
		this.bewohner = bewohner;
	}
	
	public void addBewohner(String neuerBewohner) throws Error {
		
		boolean added = false;
		
		for (int i = 0; i < bewohner.length; i++) {
			if(bewohner[i] != null)
			{
				bewohner[i] = neuerBewohner;
				added = true;
				break;
			}
			
			if(!added)
				throw new Error("Kein Platz vorhanden!");
		}
	}

	

}
