package com.programmierenJava02.uebung7.a1;

import java.util.LinkedList;

public class NoDuplicatedStringList {
	private LinkedList<String> strLst;
	
	
	public NoDuplicatedStringList() {
		strLst = new LinkedList<String>();
		
	}
	
	public boolean add(String s)
	{
		for (String string : strLst) {
			if(s.toLowerCase().equals(string.toLowerCase()))
				return false;
		}
		
		strLst.add(s);
		return true;
	}
	
	public void printAllElements() {
		
		strLst.forEach(System.out::println);
		
	}

}
