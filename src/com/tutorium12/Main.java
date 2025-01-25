package com.tutorium12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kreis k = new Kreis(5);
		Rechteck r = new Rechteck(4, 6);
		Quadrat q = new Quadrat(45);
		Dreieck d = new Dreieck(4, 5);
		
		Gitarre g = new Gitarre();
		Piano p = new Piano();
		Trommel t = new Trommel();
		
		Instrument[] instrumente = new Instrument[3];
		
		instrumente[0] = g;
		instrumente[1] = p;
		instrumente[2] = t;
		
		for (Instrument instrument : instrumente) {
			instrument.tune();
			instrument.play();
			System.out.println();
		}
		
		
		k.gebeFlaecheAus();
		r.gebeFlaecheAus();
		q.gebeFlaecheAus();
		d.gebeFlaecheAus();	
		
		System.out.println(d.toString());
		
	}

}
