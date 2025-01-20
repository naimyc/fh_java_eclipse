package com.classes;

public class Auto implements Cloneable {
	private String autoTyp;
	private AutoReifenSatz reifen;

	public Auto(String autoTyp, AutoReifenSatz reifen) {
		super();
		this.autoTyp = autoTyp;
		this.reifen = reifen;
	}

	@Override
	public Auto clone() throws CloneNotSupportedException {
		Auto a = (Auto) super.clone();
		a.reifen = reifen.clone();

		return a;
	}

	public String getAutoTyp() {
		return autoTyp;
	}

	public void setAutoTyp(String autoTyp) {
		this.autoTyp = autoTyp;
	}

	public AutoReifenSatz getReifen() {
		return reifen;
	}

	public void setReifen(AutoReifenSatz reifen) {
		this.reifen = reifen;
	}

	@Override
	public String toString() {
		return "Autotyp: " + autoTyp + "\tReifen: " + reifen.getTyp() + ", " + reifen.getAnzahl();
	}
}
