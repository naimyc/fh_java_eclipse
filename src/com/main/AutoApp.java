package com.main;
import com.classes.Auto01;
import com.classes.Reifen;

public class AutoApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Reifen r = new Reifen(3, 3);	
		Auto01 a = new Auto01(r, "BWM", 1990);
		Auto01 aCopy = a.clone();
		
		
		System.out.println(a.getReifen().getAnzahl());
		System.out.println(aCopy.getReifen().getAnzahl());
		
		aCopy.setReifen(4, 4);
		
		System.out.println(a.getReifen().getAnzahl());
		System.out.println(aCopy.getReifen().getAnzahl());
		
		
		
	}

}
