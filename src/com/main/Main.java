package com.main;

import java.util.Scanner;

import com.classes.*;

public class Main {

	public static void main(String[] args) {
		Quadrat_1 q = new Quadrat_1(4);
		Kreis k = new Kreis(4);
		
		if(k instanceof Flaeche){
			System.out.println("as");
		}
		System.out.println(k instanceof Flaeche);
	}
}
