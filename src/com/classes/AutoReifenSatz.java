package com.classes;

public class AutoReifenSatz implements Cloneable {
	String typ;
	int anzahl;

	public AutoReifenSatz(String typ, int anzahl) {
		this.typ = typ;
		this.anzahl = anzahl;
	}

	@Override
	public AutoReifenSatz clone() throws CloneNotSupportedException {
		return (AutoReifenSatz) super.clone();
	}

	public String getTyp() {
		return typ;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
}
