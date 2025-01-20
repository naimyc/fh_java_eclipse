package com.classes;

public class Kreis extends Flaeche {
	private int radius;

	public Kreis(int radius) {
		this.radius = radius;
	}

	@Override
	public int getUmfang() {
		// TODO Auto-generated method stub
		return (int) (2 * Math.PI * radius);
	}

}
