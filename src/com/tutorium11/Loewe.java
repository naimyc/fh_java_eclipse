package com.tutorium11;

public class Loewe extends Tier {

	public Loewe(double groesse, double gewicht) {
		super("Löwe", groesse, gewicht);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void macheGeraesch() {
		// TODO Auto-generated method stub
		System.out.println(super.getArtenname());
		super.macheGeraesch();
	}
}
