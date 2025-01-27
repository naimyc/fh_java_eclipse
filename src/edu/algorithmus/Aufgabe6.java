package edu.algorithmus;

import javax.swing.JOptionPane;

public class Aufgabe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			int dividend = eingabe();
			int divisor = eingabe();

			if (divisor == 0)
				throw new Exception("Divisor darf nicht 0 sein!");

			int[] rechnung = rechnung(dividend, divisor);

			System.out.printf("Quotient: %d, Rest: %d\n", rechnung[0], rechnung[1]);

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
	}

	static int[] rechnung(int dividend, int divisor) {
		int quotient = dividend / divisor;
		int rest = dividend % divisor;

		int[] rechnung = { quotient, rest };

		return rechnung;
	}

	static int eingabe() throws Exception {
		String input = JOptionPane.showInputDialog("Gebe eine positive Zahl ein!");
		int num = -1;
		try {

			num = Integer.parseInt(input);

			if (num < 0)
				throw new Exception("Zahl muss positiv sein!");
			return num;
		} catch (Exception e) {
			// TODO: handle exception
			try {
				Double.parseDouble(input);
			} catch (Exception e2) {
				// TODO: handle exception
				throw new Exception("Eingabe darf nicht ein String sein!");
			}
			throw new NumberFormatException("Eingabe darf nicht ein Double sein!");
		}
	}
}
