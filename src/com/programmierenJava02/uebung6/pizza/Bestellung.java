package com.programmierenJava02.uebung6.pizza;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedList;

public class Bestellung {
	
	private LinkedList<Pizza> pizzas;
	
	
	public Bestellung() {
		pizzas = new LinkedList<Pizza>();
	}
	
	public void addPizza(Pizza p)
	{
		pizzas.add(p);
	}
	
	public double calculatePrice() {
		double price = 0;
		for (int i = 0; i < pizzas.size(); i++) {
			price += pizzas.get(i).calculatePrice();
		}
		return new BigDecimal(price).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
	
}
