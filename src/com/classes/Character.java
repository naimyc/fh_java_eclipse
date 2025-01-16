package com.classes;

import javax.swing.JOptionPane;

public class Character {
	public int zeichen(char[] a) {
		char anfang = (char) Math.min(a[0], a[1]);
		char ende = (char) Math.max(a[0], a[1]);

		char g_char = a[2];
		char rand_char = (char) ((Math.random() * ende - anfang + 1) + ende);

		System.out.println("Run!");

		if (g_char == rand_char) {
			System.out.println("Found");
			return (int) g_char;
		} else {
			return zeichen(a);
		}

	}

	public String eingabe() {
		return JOptionPane.showInputDialog("Geben Sie Ihren char Array ein!");
	}

	public void main(String[] args) {
		
		char[] cArray = eingabe().toCharArray();

		if (cArray.length > 3 || cArray.length < 3)
			throw new Error("Error: Geben Sie nur 3 Zeichen ein!");

		char a = (char) Math.min(cArray[0], cArray[1]);
		char e = (char) Math.max(cArray[0], cArray[1]);
		char g_char = cArray[2];

		if (g_char < a || g_char > e)
			throw new Error("Error: Das dritte Element soll in zwischen den ersten und zweiten sein!");
		else if ((e - a) == 1)
			throw new Error("Error: Der Bereich ist leer!");

		int c_value = zeichen(cArray);
	}
}
