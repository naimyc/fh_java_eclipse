package edu.streams;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.*;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DateiLesen {

	public DateiLesen() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static void main(String[] args) {
	String txt = read_data();
	String personData = getTagData(txt, "person");
	
	String namen = getTagData(personData, "name");
	System.out.println(namen);
	}
		
	static public String getTagData(String xmlBlock, String tag)
	{
		String pat = "<%s>(.*?)</%s>".formatted(tag, tag);
		System.err.println(pat);
		
		Pattern pattern = Pattern.compile(pat, Pattern.DOTALL);
		Matcher tagMatcher = pattern.matcher(xmlBlock);
		String tagData = tagData = "";
		
		ArrayList<String> pData = new ArrayList<String>();
		
		
		while(tagMatcher.find()) {
			if(tag.equals("person"))
					tagData += tagMatcher.group(1);
			else
				pData.add(tagMatcher.group(1));
		}
		
		
		return tagData;
	}
	public static String[] getPersonData(String xmlBlock, String tag) {
		String pat = "<%s>(.*?)</%s>".formatted(tag, tag);
		System.err.println(pat);
		
		Pattern pattern = Pattern.compile(pat, Pattern.DOTALL);
		Matcher tagMatcher = pattern.matcher(xmlBlock);
		ArrayList<String> pData = new ArrayList<String>();
		
		while(tagMatcher.find()) {
			pData.add(tagMatcher.group(1));
		}
		return (String[]) pData.toArray();
	}
	
	public static String read_data() {
		
		
		try(Reader reader = new FileReader("zitate.xml"))
		{
			int i = -1;
			String text = new String();
			while((i = reader.read()) != -1)
				text += (char) i;
			
			return text;
		}
		catch(Exception e)
		{
			System.err.println("Error: " + e);
			return null;
		}
	}

}
