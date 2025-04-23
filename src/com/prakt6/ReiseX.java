package com.prakt6;

public class ReiseX extends Reise {
	private String veranstalter;

	public ReiseX(String startflughafen, String reiseziel, int reisedauer) {
		super(startflughafen, reiseziel, reisedauer);
		// TODO Auto-generated constructor stub
	}

	public ReiseX(String startflughafen, String reiseziel) {
		super(startflughafen, reiseziel);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected boolean istKurzUrlaub() {
		// TODO Auto-generated method stub
		return getReisedauer() < 5;
	}

}
