package com.tutorium13;

public class Person {
	private Nahrungsmittel[] nahrungsmittel;

	/**
	 * @param nahrungsmittel
	 */
	public Person(Nahrungsmittel[] nahrungsmittel) {
		this.nahrungsmittel = nahrungsmittel;
	}

	public int esseUndTrinke() {
		double kGesamt = 0;
		for (Nahrungsmittel n : nahrungsmittel) {
			kGesamt += n.getKalorien();
			n.gebeAus();
		}
		System.out.println("Eingenommene Kalorien: "+ kGesamt);
		return (int) kGesamt;
	}

	public int esse() {
		double kGesamt = 0;
		for (Nahrungsmittel n : nahrungsmittel) {
			if (n instanceof Essbar) {
				((Essbar) n).essen();
				kGesamt += n.getKalorien();
			}
		}
		System.out.println("Eingenommene Kalorien: "+ kGesamt);

		return (int) kGesamt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nahrungsmittel[] n = new Nahrungsmittel[4];
		Steak s = new Steak();
		Kaffe k = new Kaffe();
		
		n[0] = s;
		n[1] = s;
		n[2] = k;
		n[3] = k;
		
		Person p = new Person(n);
//		p.esse();
		p.esseUndTrinke();
	}

}
