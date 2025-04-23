package com.aufgaben;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) {
		try(BufferedWriter buf_w = new BufferedWriter(new FileWriter("data.csv")); BufferedReader buf_r = new BufferedReader(new FileReader("data.csv"));)
		{
			String s, result = "";
			buf_w.write("hello, whats up, im good\nn"
					+ "asdasd");
			buf_w.flush();
			buf_w.close();
			
			while((s = buf_r.readLine() ) != null)
				result += "\n"+s;
			System.out.println(result.substring(1));
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
	}

}
