package com.programmierenJava02.uebung6;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Aufgabe1 {
	
	public static void main(String[] args) {
		int i = 0;
		LinkedList<String> llst = new LinkedList<String>();
		
		while(i < 7)
		{
			llst.add(JOptionPane.showInputDialog("Enter your input!"));
			i++;
		}
		
		for (int j = 0; j < llst.size()-1; j++) 
			System.out.println(llst.get(j));
		
		System.err.println("---------------------");
		
		
		for (int j = llst.size()-1; j > -1; j--)
			System.out.println(llst.get(j));
		
	}

}
