package com.main;

import com.classes.*;

public class Main {

	public static void main(String[] args) {
		Auto a = new Auto();

		a.setMarke("Audi");
		a.setModell("A11.0");
		a.setBaujahr(1999);
		a.setGeschwindigkeit(8);

		a.ausgabe();
	}
}
