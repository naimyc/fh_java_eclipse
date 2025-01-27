package edu.aufgabe7;

public abstract class Gebaeude implements Ding {
	private int farbe;
	private String typ;
	
	/**
	 * @param farbe
	 * @param typ
	 */
	public Gebaeude(int farbe, String typ) {
		this.farbe = farbe;
		this.typ = typ;
	}
	
	int getFarbe() {
		return farbe;
	}

	void setFarbe(int farbe) {
		this.farbe = farbe;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	@Override
	public void anstreichen(int farbe) {
		// TODO Auto-generated method stub

	}

}
