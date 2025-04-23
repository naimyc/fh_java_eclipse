package com.classes;

public class Auto01 implements Cloneable {
	private Reifen reifen;
	private String typ;
	private int jahr;
		
	/**
	 * @param reifen
	 * @param typ
	 * @param jahr
	 */
	public Auto01(Reifen reifen, String typ, int jahr) {
		this.reifen = reifen;
		this.typ = typ;
		this.jahr = jahr;
	}
	
	public Reifen getReifen() {
		return reifen;
	}
	public void setReifen(int groesse, int anzahl) {
		reifen.setAnzahl(anzahl);
		reifen.setGroesse(groesse);;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public int getJahr() {
		return jahr;
	}
	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
	
	@Override
	public Auto01 clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Auto01 copy = (Auto01) super.clone();
		copy.reifen = reifen.clone();
		
		return copy;
	}
	
	
}
