package com.prakt6;

import java.util.Scanner;

public class ReiseAnwendung {

	public static void main(String[] args) {
		Reise[] r = new Reise[4];
		
		for(int i = 0; i < r.length; i++)
		{
			Scanner myObj = new Scanner(System.in);
			String startFlughafen, reiseziel;
			
			System.out.println("Gebe Flughafen 1 ein:");
			startFlughafen = myObj.next();
			System.out.println("Gebe Flughafen 2 ein:");
			reiseziel = myObj.next();
			
			r[i] = new ReiseX(startFlughafen, reiseziel);
		}
		
		for(Reise reise : r)
			System.out.println(reise.toString()+"\n");
		
		
	}

}
