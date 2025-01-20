package com.classes;

abstract public class GleichseitigesEck extends Flaeche {
	private int anzEcken, seitenLaenge;

	public GleichseitigesEck(String type, int s, int e) {
		seitenLaenge = s;
		anzEcken = e;

		super.setTyp(type);
	}

	@Override
	public int getUmfang() {
		return seitenLaenge * anzEcken;
	}

}
