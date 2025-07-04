package com.programmierenJava02.uebung6.pizza;

public class Zutat {
	private String name;
	private double preis;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	/**
	 * @param name
	 * @param preis
	 */
	public Zutat(String name, double preis) {
		this.name = name;
		this.preis = preis;
	}
	
	
	

}
