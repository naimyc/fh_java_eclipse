package com.classes;

public class Laeufer {
	// Attribute
	private Uhrzeit startZeit, ankunftsZeit;
	private String laufDauer;

	// Konstruktor
	Laeufer(Uhrzeit startZeit, Uhrzeit ankunftsZeit) {
		this.startZeit = startZeit;
		this.ankunftsZeit = ankunftsZeit;
	}

	// Methode
	String getLaufDauer() {
		laufDauer = ankunftsZeit.minus(startZeit);
		return laufDauer;
	}
}