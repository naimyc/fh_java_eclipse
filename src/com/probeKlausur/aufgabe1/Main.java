package com.probeKlausur.aufgabe1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Buch buch1 = new Buch("Moby Dick", "Herman Melville", "Hanser", 1851, 918);
		Buch buch2= new Buch("Schuld und Suhne", "Fjodor Dostojewski", "dtv", 1866, 801);
		Buch buch3 = new Buch("Ulysses", "James Joyce ", "Suhrkamp", 1922, 987);
		
		
		
		String s = buch1.toTextFormat();
		s += "\n"+buch2.toTextFormat();
		s += "\n"+ buch3.toTextFormat();
		
		try(OutputStream out = new DataOutputStream(new FileOutputStream("books.txt"));  InputStream in = new DataInputStream(new FileInputStream("books.txt"))){
			out.write(s.getBytes());
			byte[] bytes = in.readAllBytes();
			String byte_data = new String(bytes);
			System.out.println(byte_data);
		}

		// System.out.println(s);
		
	}

}
