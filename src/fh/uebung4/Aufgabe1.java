package fh.uebung4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Aufgabe1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next(), vorname = sc.next();
		try(PrintWriter pw = new PrintWriter(new FileWriter(vorname+".txt"));)
		{
			pw.println(vorname +",\t"+ name);
			pw.flush();
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		
		try(InputStreamReader in = new InputStreamReader(new FileInputStream(vorname+".txt")))
		{
			int i = 0;
			String s = new String();
			while((i = in.read()) != -1)
			{
				s += (char) i;
			}
			System.out.println(s);
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
	}
}
