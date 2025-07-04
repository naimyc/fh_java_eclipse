package com.vererbung.a1;
import java.util.Scanner;

public class DynamicStringArray {
	static String[] strArr = new String[10];
	static int count = 0;
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		DynamicStringArray dStr = new DynamicStringArray();
		
		
		for(int i = 0; i < 20; i++)
			dStr.add(""+i);
		
		dStr.printAllItems();
		dStr.removeAt(18);
		
	}
	
	
	public static void add(String s) {
		int arrayLength = getLength();

		if (count == arrayLength) {
			String[] new_strArr = new String[arrayLength * 2];

			for (int i = 0; i < strArr.length; i++)
				new_strArr[i] = strArr[i];

			new_strArr[count] = s;
			strArr = new_strArr;
			count++;
		} else {
			strArr[count] = s;
			count++;
		}
	}

	public static int getLength() {

		return strArr.length;
	}

	public static int getCount() {
		return count;
	}

	public static void printAllItems() {
		System.out.println("Items:");
		for (String string : strArr) {
			System.out.println(string);
		}
	}

	public static void removeAt(int index) {
		
		strArr[index -1] = null; // 18
		for(int i = index -1; i < strArr.length-1; i++)
			strArr[i] = strArr[i+1];
		
		System.out.println(strArr[index]);
	}

	public static boolean contains(String s) {
		for (String el : strArr)
			if (s.equals(el))
				return true;

		return false;
	}

	public static String get(int index) {
		return strArr[index];
	}

}
