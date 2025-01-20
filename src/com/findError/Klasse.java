package com.findError;

public class Klasse {

	private int eigenschaft;

	Klasse(int eigenschaft) {
		this.eigenschaft = eigenschaft;
	}

	int getEigenschaft() {
		return eigenschaft;
	}

	void setEigenschaft(int eigenschaft) {
		this.eigenschaft = eigenschaft;
	}

	int aenderung(double wert) {
		if (eigenschaft < wert)
			eigenschaft = (int) wert;
		return eigenschaft;
	}
}
