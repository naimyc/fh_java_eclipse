package com.programmierenJava02.uebung2;

public class Quersumme {

	public static void main(String[] args) {
		String num = "22";

		if (Integer.parseInt("" + num.charAt(0)) == 2)
			System.out.println(true);
		
		try {
			
			System.out.println(fakultaet(-1));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
	static public long fakultaet(int n) throws Exception
	{
		if(n < 0)
			throw new Exception("Fehler Fehler Fehler!");
		if(n < 2)
			return 1;
		else 
			return n * fakultaet(n-1);
	}
	static public int rekSumme(int n) {
		//	1230
		if (n < 10)
			return n;
		else
			return n % 10 + rekSumme(n /10);
	}

}
