package com.tutorium11;

public class Zebra extends Tier {

	public Zebra(double groesse, double gewicht) {
		super("Zebra", groesse, gewicht);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void macheGeraesch() {
		// TODO Auto-generated method stub
		System.out.println(super.getArtenname());
		super.macheGeraesch();
	}

}
