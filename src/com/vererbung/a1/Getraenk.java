package com.vererbung.a1;

public class Getraenk {
	private String name, groesse;
	private double preis;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroesse() {
		return groesse;
	}
	public void setGroesse(String groesse) {
		this.groesse = groesse;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}

	
	@Override
	public String toString() {
		return String.format("Getraenk [name=%s, groesse=%s, preis=%s]", name, groesse, preis);
	}
	public static void main(String[] args) {
		System.err.println(new Getraenk().toString());
	}
}
