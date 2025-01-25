package com.tutorium11;

import java.util.Random;

public class Zoo {
	private Tier[] tiere;
	
	
	
	/**
	 * @param tiere
	 */
	public Zoo() {
		Random r = new Random();
		int platz = r.nextInt(10, 31);
		
		tiere = new Tier[platz];
	}

	public void tierHinzufuegen(Tier tier) {
		// int lastIndex = -1;
		tiere[0] = new Loewe(7, 8);
		
		for (int i = 0; i < tiere.length; i++) {
			if(tiere[i] == null)
				System.out.println(i+1 + ". Null");
			else 
				tiere[i] = tier;
		}
	}
	
	public void allePlaetzeBelege() {
		int arrayIndex = -1;
		for (int i = 0; i < tiere.length; i++) {
			Tier tier = tiere[i];
			if(tier == null)
				tiere[i] = new Loewe(9, 9);			
		}
	}
	
	public void tierEntfernen(int index) {
		tiere[index] = null;
	}
	
	public void ausgabe() {
		for (Tier tier : tiere) {
			tier.macheGeraesch();
		}
	}
}
