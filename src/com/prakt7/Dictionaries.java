package com.prakt7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Dictionaries {

	public static void main(String[] args) {
		Map<String, Integer> ids = new HashMap<String, Integer>();
		for (int i = 0; i < 10; i++) {
			Random r = new Random();
			char c = (char) r.nextInt(65, 90);
			String s = String.valueOf(c);
			ids.put(s, 1);
//			System.err.println(s);
		}
		System.out.println(ids.size());
		System.out.println();
//		for(String key : ids.keySet())
//		{
//			System.out.println(key);
//		}
		for (Map.Entry<String, Integer> entry : ids.entrySet()) {
		    String key = entry.getKey();
		    Object val = entry.getValue();
		    System.out.println(key +" "+ val);
		}
	}

}
