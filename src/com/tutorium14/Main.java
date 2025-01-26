package com.tutorium14;

public class Main {
	public static void main(String[] args)  {
		Palindrom p = new Palindrom();
		
		try {
			String s = "";
			
			if(s.equals(""))
				throw new LeererStringException();

			int isPalindrom = p.isPalindrom(s.toCharArray(), s.toCharArray().length - 1);
		} catch (LeererStringException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
