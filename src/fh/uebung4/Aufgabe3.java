package fh.uebung4;

import java.io.BufferedReader;
import java.io.FileReader;

public class Aufgabe3 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("hp1.txt")))
		{
			String s = new String(), text = s;
			while((s = br.readLine()) != null)
				text += s;
			System.out.println(text);
			System.out.println(countWords(text, "Fluffy"));
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
	}
	static private int countWords(String fullString, String word)
	{
		return (fullString.length() - fullString.replace(word, "").length()) / word.length();
	}
}
