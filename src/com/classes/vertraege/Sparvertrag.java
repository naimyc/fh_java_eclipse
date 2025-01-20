package com.classes.vertraege;

public abstract class Sparvertrag {
	private String sparer, vertragsTyp;

	public Sparvertrag(String sparer, String vertragsTyp) {
		super();
		this.sparer = sparer;
		this.vertragsTyp = vertragsTyp;
	}

	public String getSparer() {
		return sparer;
	}

	void setSparer(String sparer) {
		this.sparer = sparer;
	}

	public String getVertragsTyp() {
		return vertragsTyp;
	}

	void setVertragsTyp(String vertragsTyp) {
		this.vertragsTyp = vertragsTyp;
	}

}
