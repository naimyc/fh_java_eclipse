package com.zahlensysteme;

import java.util.Iterator;

abstract public class Umwandlung implements Zahlensysteme {
	private int base;

	/**
	 * @param num
	 */
	public Umwandlung(int base) {
		this.base = base;
	}

	public int binToOct(int num) {
		StringBuffer b = new StringBuffer("" + num);
		int[] iArr = new int[10];
		int i = b.length() - 3;

		while (i >= 0) {
			b.insert(i, "-");
			i -= 3;
		}
		
		String[] s = b.toString().split("-");
		for (String string : s) {
			try {

//				iArr[0] = Integer.parseInt(string);
				System.out.println(string);
				
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		return -1;
	}

	public int convertToBin(int num) {
		StringBuffer b = new StringBuffer("");

		while (num != 0) {
			if ((num % bin) == 0)
				b.append("0");
			else
				b.append("1");

			System.out.println(num + ", " + num % 2);
			num /= bin;
		}

		System.out.println(b.reverse());
		return Integer.parseInt(b.reverse().toString());
	}

}
