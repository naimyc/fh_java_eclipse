package com.tutorium11;

import javax.swing.JOptionPane;

public class Tutorium11_1 {
	double zahl1, zahl2;
	public void eingabe() {
		
		try {
			zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Erste eingabe!"));
		zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Erste eingabe!"));
	
		} catch (Exception e) {
			System.out.println("Error!");
		}
	}
	
	public void ausgabe() {
		if(zahl1 > zahl2)
			System.out.println("Zahl: " + zahl1);
		else 
			System.out.println("Zahl: " + zahl2);
	}
}
