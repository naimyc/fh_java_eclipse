package com.classes.vertraege;

import com.intefaces.Interfaces.Zinsen;

public class NormSparvertrag extends Sparvertrag implements Zinsen {

	private double guthaben;
	private int U = 3;
	private final int W = 5;

	public NormSparvertrag(String sparer, double guthaben) {
		super(sparer, "Normaler Sparvertrag");
		setGuthaben(guthaben);
	}

	public double getGuthaben() {
		return guthaben;
	}

	public void setGuthaben(double guthaben) {
		this.guthaben = guthaben;
	}

	public void addZins(int dauer) {
		double zins = -1;

		if (dauer < W)
			zins = ZINS1;
		else
			zins = ZINS2;

		if (U == 0)
			U = 3;

		guthaben += (zins / 100 * guthaben) * dauer;
	}

}
