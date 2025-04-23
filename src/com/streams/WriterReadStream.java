package com.streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriterReadStream {
	static int number = 0;
	
	
	
	public static void main(String[] args) {
		WriterReadStream ws = new WriterReadStream();
		
		
		
		/*
		ws.writeBytes("Hello.txt");
		String text = ws.readBytes("Hello.txt");
		*/
		ws.writeChars("HelloChars.txt");
		String text = ws.readChars("HelloChars.txt");
		
		
		System.out.println(text);
	}
	
	void writeChars(String file)
	{
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(file)))
		{
			String text = "Hello Chars!";
			dos.writeInt(text.length() * 2);
			dos.writeChars(text);
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
	}
	
	String readChars(String file)
	{
		String data = null;
		try(DataInputStream dis = new DataInputStream(new FileInputStream(file)))
		{
			byte [] bytes = new byte[dis.readInt()];
			dis.read(bytes);
			
			data = new String(bytes);
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		return data;
	}

	void writeBytes(String file)
	{
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(file)))
		{
			
			String data = "Hello World!";
			
			dos.writeInt(data.length());
			dos.writeBytes(data);
		}catch(IOException ex)
		{
			System.out.println(ex);
		}
	}
	
	String readBytes(String file)
	{
		String data = null;
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream(file)))
		{
			
			data = new String(dis.readNBytes(dis.readInt()));
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		
		return data;
	}

}
