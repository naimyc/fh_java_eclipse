package edu.aufgabe7;

public class Reihenhaus extends Haus {

	/**
	 * @param farbe
	 */
	public Reihenhaus() {
		super(1);
		super.setTyp("Reihenhaus");
	}
	
	@Override
	public void anstreichen(int farbe) {
		// TODO Auto-generated method stub
		super.anstreichen(farbe);
		System.out.println("Haustyp: "+ getTyp());
	}

}
