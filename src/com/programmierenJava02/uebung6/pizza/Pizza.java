package com.programmierenJava02.uebung6.pizza;

import java.util.LinkedList;

public class Pizza {

	private double durchmesser;
	private LinkedList<Zutat> zutaten;
	
	/**
	 * @param durchmesser
	 */
	public Pizza(double durchmesser) {
		this.durchmesser = durchmesser;
		zutaten = new LinkedList<Zutat>();
	}
	
	public void addZutat(Zutat z) {
		zutaten.add(z);
	}
	
	public double calculatePrice() {
		
		double price = (Math.PI * Math.pow(durchmesser, 2)) * 0.01;
		
		for (int i = 0; i < zutaten.size(); i++) {
			price += zutaten.get(i).getPreis();
		}
		
		return price;
	}

}
