package edu.aufgabe7;

public class Haus extends Gebaeude {

	/**
	 * @param farbe
	 * @param typ
	 */
	public Haus(int farbe) {
		super(farbe, "Normales Haus");
	}

	@Override
	public void anstreichen(int farbe) {
		// TODO Auto-generated method stub
		if (farbe < 1 || farbe > 10) {
			farbe = -1;
			System.err.println("Geben sie einen erlaubtenWert ein!");
		}

		super.anstreichen(farbe);
	}

}
