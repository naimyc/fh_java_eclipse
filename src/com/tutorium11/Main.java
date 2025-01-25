package com.tutorium11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo z = new Zoo();
		
		
		Tier t1 = new Loewe(3, 7);
		Tier t2 = new Zebra(9, 8);
		
		
		z.tierHinzufuegen(t1);
		z.tierHinzufuegen(t2);
		
		z.allePlaetzeBelege();
		
		z.ausgabe();
		
	}

}
