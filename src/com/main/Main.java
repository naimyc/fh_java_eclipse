package com.main;

import com.classes.Character;
public class Main {

	public static void main(String[] args) {
		Character z = new Character();
		char[] a = {'a', 'c', 'h'};
		
		
		char zeichen;
		try {
			zeichen = (char) z.zeichen(a);
			System.out.println("Character: " + zeichen);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
