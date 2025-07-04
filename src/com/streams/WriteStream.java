package com.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WriteStream {
	public static void main(String args[]) {
		try(BufferedReader br = new BufferedReader(new FileReader("hp1.txt"))) {
			String line;
			String text = "";
			while ((line = br.readLine()) != null) {
				text += line + "\n";
			}
			String[] list = text.toLowerCase().split(" ");
			int count = 0;
			for (String ing : list) {
				if (ing.contains("hermione")) {
					count++;
				}
			}
			System.out.println(count);
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}