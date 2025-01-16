package com.classes;

public class Character {
	public int zeichen(char[] a) throws Exception {
		char anfang = (char) Math.min(a[0], a[1]);
		char ende = (char) Math.max(a[0], a[1]);

		char g_char = a[2];
		char rand_char = (char) ((Math.random() * ende - anfang + 1) + ende);

		if (g_char < anfang || g_char > ende) {
			throw new Exception("Error: Char is not in the interval!");
		}
		
		System.out.println("hola");

		if (g_char == rand_char) {
			System.out.println("Found");
			return (int) g_char;
		} else {
			return zeichen(a);
		}

	}
}
