package com.main;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static String username;

	public static void main(String[] args) {
		Deque<String> strLst = new LinkedList<String>();
		
		for (int i = 0; i < 5; i++) {
			
			strLst.addLast(""+i);
		}
		for (int i = 0; i < strLst.size(); i++) {
			String s =strLst.getFirst();
			System.out.println(s);
		}
	}
}
