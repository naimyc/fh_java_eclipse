package com.classes.vertraege;

public class SparvertragApp {
	public static void main(String[] args) {
		BankSparvertraege bank = new BankSparvertraege("Bank1");

		bank.vertragHinzufuegen("ansbdj", 700.0, "vertragplus");

		Sparvertrag s1 = bank.getVetragArray()[0];
		
//		VertragPlus p1 = new VertragPlus("Sparer 1", 80);
//		
//		System.out.println(p1.getZinsen());
//		s1.setZinsen(9);
//		System.out.println(p1.getZinsen());
		
		
		if (s1 instanceof NormSparvertrag) {
			NormSparvertrag n1 = (NormSparvertrag) s1;
			n1.addZins(9);
			System.out.println("Guthaben: " + n1.getGuthaben());
		} else if (s1 instanceof VertragPlus) {
			VertragPlus p2 = (VertragPlus) s1;
			p2.addZins(4);
			System.out.println("Guthaben: " + p2.getGuthaben());
		}

	}

}
