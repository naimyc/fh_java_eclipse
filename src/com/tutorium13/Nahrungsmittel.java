package com.tutorium13;

public abstract class Nahrungsmittel {
	private String name;
	private String typ;
	private int kalorien;
	
	/**
	 * @param name
	 * @param typ
	 * @param kalorien
	 */
	public Nahrungsmittel(String name, String typ, int kalorien) {
		this.name = name;
		this.typ = typ;
		this.kalorien = kalorien;
	}
	public String getName() {
		return name;
	}

	public String getTyp() {
		return typ;
	}

	public int getKalorien() {
		return kalorien;
	}

	public void gebeAus() {
		System.out.printf("Name: %s\nTyp: %s\nKalorien: %d", name, typ, kalorien);
		System.out.println();
		System.out.println();
	}
}
