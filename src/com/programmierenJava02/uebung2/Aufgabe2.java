package com.programmierenJava02.uebung2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Aufgabe2 {
	
	public static void main(String[] args) throws IOException {
		
		OutputStream os = new FileOutputStream("File01.txt");
		DataOutputStream dos = new DataOutputStream(os);
		String s = "Hello";
		byte[] text = s.getBytes();
		PrintStream pStr = new PrintStream(System.out);
		pStr.print(true);
		
//		for (byte b : text) {
//			System.out.print(b);
//		}
		System.out.println(text);
		dos.write(text);
		dos.flush();
		dos.close();
		
	}

	public Aufgabe2() {
		// TODO Auto-generated constructor stub
	}

}
