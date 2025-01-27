package edu.aufgabe7;

public class Haeuser {
	private String strasse;
	private Haus[] haeuserDerStrasse;

	
	/**
	 * @param strasse
	 */
	public Haeuser(String strasse) {
		this.strasse = strasse;
		haeuserDerStrasse = new Haus[1];
		
	}
	public Haus[] getHaeuserDerStrasse() {
		return haeuserDerStrasse;
	}
	public void hausbau(int farbe, String typ) {
		
		Haus h = new Haus(farbe);
		
		if(typ.toLowerCase().equals("reihenhaus"))
			h = (Reihenhaus) h;
		
		for (int i = 0; i < haeuserDerStrasse.length; i++) {
			
			if(haeuserDerStrasse[i] != null)
				haeuserDerStrasse[i] = h;
			else 
				throw new Error("Es gibt kein Platz mehr in der Strasse!");
		}
	}
}
