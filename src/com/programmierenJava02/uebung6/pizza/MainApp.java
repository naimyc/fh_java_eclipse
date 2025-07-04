package com.programmierenJava02.uebung6.pizza;

import java.util.LinkedList;
import java.util.Map;

public class MainApp {

	public static void main(String[] args) {
/*
Tomatensoße: 0.50€
K¨ase: 0.90€
Salami: 1.00€
Peperoni: 0.35€
Schinken: 1.10€
*/
		LinkedList<Zutat> zutaten = new LinkedList<Zutat>();
		
		String[] zName = new String[] {
				"Tomatensoße", 
				"Käse", 
				"Salami", 
				"Peperoni",
				"Schinke"
		};
		double[] zPrice = new double[] {
				0.5,
				0.9,
				1,
				0.35,
				1.10
		};
		
		for (int i = 0; i < 5; i++) {
			zutaten.add(new Zutat(zName[i], zPrice[i]));
		}
		
		Pizza margerita = new Pizza(25);
		margerita.addZutat(zutaten.get(0));
		margerita.addZutat(zutaten.get(1));
		
		Pizza diavolo = new Pizza(30);
		diavolo.addZutat(zutaten.get(0));
		diavolo.addZutat(zutaten.get(1));
		diavolo.addZutat(zutaten.get(3));
		
		Pizza special = new Pizza(35);
		special.addZutat(zutaten.get(0));
		special.addZutat(zutaten.get(1));
		special.addZutat(zutaten.get(2));
		special.addZutat(zutaten.get(3));
		special.addZutat(zutaten.get(4));
		
		Bestellung b1 = new Bestellung();
		b1.addPizza(margerita);
		b1.addPizza(diavolo);

		Bestellung b2 = new Bestellung();
		b2.addPizza(margerita);
		b2.addPizza(margerita);
		b2.addPizza(diavolo);
		b2.addPizza(diavolo);
		b2.addPizza(diavolo);
		b2.addPizza(special);
		b2.addPizza(special);
		
		
		System.out.println("Bestellung 1: %.2f, Bestellung: %.2f".formatted(b1.calculatePrice(), b2.calculatePrice()));
	}

}
