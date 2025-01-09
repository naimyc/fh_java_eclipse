package com.classes;

import javax.swing.JOptionPane;

class LaufZeitApp {

	static Laeufer[] l;

	public static void main(String args[]) {
		String ersteEingabe, zweiteEingabe, ausgabe;
		Uhrzeit start, ankunft;
		String dauer;

		int laeuferInt = Integer.parseInt(args[0]);
		l = new Laeufer[laeuferInt];
		int i = 0;
		// Einlesen der Eingabestrings:
		while (i < laeuferInt) {

			ersteEingabe = JOptionPane.showInputDialog("Gib die Startzeit des Läufers ein:");
			zweiteEingabe = JOptionPane.showInputDialog("Gib die Ankunftzeit ein:");
			
			start = new Uhrzeit(ersteEingabe);
			ankunft = new Uhrzeit(zweiteEingabe);

			// Erzeugung eines speziellen Läufers mit start,ankunft-Zeit
			l[i] = new Laeufer(start, ankunft);
			// Berechnung Laufdauer
			i++;
			
		}

		for (Laeufer el : l) {
			dauer = el.getLaufDauer();
			// Erzeugung Ausgabestring
			ausgabe = "Die Laufzeit betraegt " + dauer + " Stunden.";
			// Ausgabe auf dem Bildschirm
			JOptionPane.showMessageDialog(null, ausgabe);
		}
		System.exit(0);
	}
}