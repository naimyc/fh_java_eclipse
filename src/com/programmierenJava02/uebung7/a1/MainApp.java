package com.programmierenJava02.uebung7.a1;

public class MainApp {

	public static void main(String[] args) {
		NoDuplicatedStringList ndLst = new NoDuplicatedStringList();
		
		for (int i = 0; i < 3; i++) {
			ndLst.add("Hello World!");
		}
		String[] s = {"laknslkd", "asndlj", "aksdn", "alsnd", "ansdl"};
		for (String string : s) {
			ndLst.add(string);
		}
		
		ndLst.printAllElements();
	}
}
