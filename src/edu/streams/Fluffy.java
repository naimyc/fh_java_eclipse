package edu.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Fluffy {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("hp1.txt")))
		{
			String i = "";
			String txt = "";
			
			while((i = br.readLine()) != null)
//				System.out.println((char) i);
				txt += i + "\n";
			
			int fluffyCount = findFluffy(txt);
			System.out.println(fluffyCount);
		}
		
		
		catch(IOException ex)
		{
			System.out.println(ex);
		}
	}
	
	public static int findFluffy(String txt) {
		String[] words = txt.split(" ");
		int fluffyCount = 0;
		for (int i = 0; i < words.length; i++) {
			if(words[i].toLowerCase().contains("fluffy"))
				fluffyCount++;
		}
		
		
		return fluffyCount;
	}
	
	public static void writeFile() {
		
	}

}
