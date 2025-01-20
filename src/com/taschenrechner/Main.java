package com.taschenrechner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation op = null;

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		if (input.equals("+"))
			op = new Addition();
		else if (input.equals("-"))
			op = new Substraction();
		else if (input.equals("*"))
			op = new Multiplication();

		else if (input.equals("/"))
			op = new Division();
		else
			throw new Error("Enter a valid parameter!");

		System.out.println(op.calculate(3, 3));
	}

}
