package com.classes;

public class Quadrat_2 {
	private double seitenLaenge;

	public Quadrat_2(double seitenLaenge) {
		super();
		this.seitenLaenge = seitenLaenge;
	}

	public double getSeitenLaenge() {
		return seitenLaenge;
	}

	public void setSeitenLaenge(double seitenLaenge) {
		this.seitenLaenge = seitenLaenge;
	}

	public double getUmfang() {
		return (double) 4 * seitenLaenge;
	}

	public double getFlaecheninhalt() {
		return seitenLaenge * seitenLaenge;
	}

}
