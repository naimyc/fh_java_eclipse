package com.classes.vertraege;

public class SparvertragApp {
	public static void main(String[] args) {
		BankSparvertraege bank = new BankSparvertraege("Bank1");

		bank.vertragHinzufuegen("ansbdj", 700.0, "vertragplus");

		Sparvertrag s1 = bank.getVetragArray()[0];

		if (s1 instanceof NormSparvertrag) {
			NormSparvertrag n1 = (NormSparvertrag) s1;
			n1.addZins(9);
			System.out.println("Guthaben: " + n1.getGuthaben());
		} else if (s1 instanceof VertragPlus) {
			VertragPlus p1 = (VertragPlus) s1;
			p1.addZins(4);
			System.out.println("Guthaben: " + p1.getGuthaben());
		}

	}

}
