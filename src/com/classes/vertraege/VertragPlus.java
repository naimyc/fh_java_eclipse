package com.classes.vertraege;

public class VertragPlus extends NormSparvertrag {

	public VertragPlus(String sparer, double guthaben) {
		super(sparer, guthaben);
		super.setVertragsTyp("Vertragsplus");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addZins(int dauer) {
		if (dauer < 1) {
			System.err.println("Dauer muss größer als 0 sein!");
			return;
		} else if (dauer > 9) {
			System.err.println("Dauer darf nicht größer als 9 sein!");
			return;
		}
		super.addZins(dauer);
	}

}
