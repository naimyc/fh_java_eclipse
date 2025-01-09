package com.classes;

public class Auto {
	public Auto(String marke, String modell, int baujahr, int geschwindigkeit) {
		super();
		this.marke = marke;
		this.modell = modell;
		this.baujahr = baujahr;
		this.geschwindigkeit = 0;
	}
	String marke, modell;
	int baujahr, geschwindigkeit;
	
	
	public String getMarke() {
		return marke;
	}
	public void setMarke(String marke) {
		this.marke = marke;
	}
	public String getModell() {
		return modell;
	}
	public void setModell(String modell) {
		this.modell = modell;
	}
	public int getBaujahr() {
		return baujahr;
	}
	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}
	public void setGeschwindigkeit(int geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}
	
	public void beschleunigen(int v)
	{
		geschwindigkeit += v;
	}
	public void bremsen()
	{
		geschwindigkeit = 0;
	}
	public void ausgabe()
	{
		System.out.printf("Marke des Autos: %s\nModell des Autos: %s\nBaujahr: %d", marke, modell, baujahr);
	}
}
