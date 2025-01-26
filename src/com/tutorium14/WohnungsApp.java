package com.tutorium14;

public class WohnungsApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wohnobjekt[] w = new Wohnobjekt[10];
		Wohnung w1 = new Wohnung("Dortmund", 0, 0, null);
		
		w[0] = w1;
		sucheWohnungen(w, "Dortmund");
	}
	
	static public void sucheWohnungen(Wohnobjekt[] wohnobjekte, String stadt) {
		for (Wohnobjekt wohnobjekt : wohnobjekte) {
			
			if (wohnobjekt != null) {
				if (wohnobjekt.getStadt().equals(stadt))
					System.out.println(wohnobjekt.toString());
			}
		}
	}

}
