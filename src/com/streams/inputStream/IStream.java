package com.streams.inputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class IStream {
	InputStream iStream = null;
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("text.txt"); FileWriter fwriter = new FileWriter("text.txt"))
		{
			int i = -1;
			while((i = fis.read()) != -1)
				System.out.println(i);
			
			
			fwriter.write("Hello World! How are you doing?");
			System.out.println("Worked!");
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
	}
	
	
	public IStream() {
	}

}
