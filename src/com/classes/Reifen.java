package com.classes;

public class Reifen implements Cloneable {
	private int groesse;
	private int anzahl;
	
	/**
	 * @param groesse
	 * @param anzahl
	 */
	public Reifen(int groesse, int anzahl) {
		this.groesse = groesse;
		this.anzahl = anzahl;
	}
	public int getGroesse() {
		return groesse;
	}
	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}
	public int getAnzahl() {
		return anzahl;
	}
	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
	
	@Override
	protected Reifen clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Reifen) super.clone();
	}

}
