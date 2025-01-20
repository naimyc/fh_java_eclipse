package com.classes.vertraege;

public class BankSparvertraege {
	private String name;
	private Sparvertrag[] vertragArray;
	private String m_nummer = "18315739";
	private int X = 7, Y = 3, Z = 9, XYZ;
	private int curIndx = 0;

	public BankSparvertraege(String name) {
		super();
		this.name = name;

		X = (X == 0) ? X = 4 : X;
		XYZ = X + Y + Z;

		vertragArray = new Sparvertrag[XYZ];
	}

	public Sparvertrag[] getVetragArray() {
		return vertragArray;
	}

	public void vertragHinzufuegen(String sparer, double guthaben, String art) {
		try {
			if (art.toLowerCase().equals("normsparvertrag"))
				vertragArray[curIndx] = new NormSparvertrag(sparer, guthaben);
			else if (art.toLowerCase().equals("vertragplus"))
				vertragArray[curIndx] = new VertragPlus(sparer, guthaben);
			else
				throw new Error("Error: Kein Vertrag gefunden!");
			curIndx++;
		} catch (Exception e) {

		}
	}

}
