package com.main;

import java.util.Arrays;

import com.classes.Character;

public class Main {

	public static void main(String[] args) {
		Character z = new Character();
		
		char[] cArray = z.eingabe().toCharArray();
		

		if(cArray.length > 3 || cArray.length < 3)
			throw new Error("Error: Geben Sie nur 3 Zeichen ein!");
		
		char a = (char) Math.min(cArray[0], cArray[1]);
		char e = (char) Math.max(cArray[0], cArray[1]);
		char g_char = cArray[2];
		
		if(g_char < a|| g_char > e)
			throw new Error("Error: Das dritte Element soll in zwischen den ersten und zweiten sein!");
		else if((e - a) == 1)
			throw new Error("Error: Der Bereich ist leer!");
		
		int c_value = z.zeichen(cArray);

	}
}
