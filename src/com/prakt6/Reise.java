package com.prakt6;

public class Reise {
	private String startflughafen, reiseziel;
	private int reisedauer;
	private double preis;

	/**
	 * @param startflughafen
	 * @param reiseziel
	 * @param reisedauer
	 * @param preis
	 */
	public Reise(String startflughafen, String reiseziel, int reisedauer) {
		this.startflughafen = startflughafen;
		this.reiseziel = reiseziel;
		this.reisedauer = reisedauer;
	}

	/**
	 * @param startflughafen
	 * @param reiseziel
	 */
	public Reise(String startflughafen, String reiseziel) {
		this.startflughafen = startflughafen;
		this.reiseziel = reiseziel;
	}

	public String getStartflughafen() {
		return startflughafen;
	}

	public void setStartflughafen(String startflughafen) {
		this.startflughafen = startflughafen;
	}

	public String getReiseziel() {
		return reiseziel;
	}

	public void setReiseziel(String reiseziel) {
		this.reiseziel = reiseziel;
	}

	public int getReisedauer() {
		return reisedauer;
	}

	public void setReisedauer(int reisedauer) {
		this.reisedauer = reisedauer;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	protected boolean istKurzUrlaub() {
		return reisedauer < 7;
	}

	@Override
	public String toString() {
		return "Reise nach: " + reiseziel + "\nab " + startflughafen + "\n" + reisedauer  + " Tage \nfür "
				+ preis + " Euro";
	}

	public static void main(String[] args) {
		Reise r = new Reise("Barcelona", "Madrid");
		r.setPreis(200.99);
		r.setReisedauer(1);
		System.out.println(r.istKurzUrlaub());
		String reisedaten = r.toString();
		System.out.println(reisedaten);
	}

}
