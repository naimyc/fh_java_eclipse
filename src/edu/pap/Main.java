package edu.pap;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String xStr = JOptionPane.showInputDialog("Gebe eine Zahl ein!");

		int x = Integer.parseInt(xStr);
		int y = 1;

		while (x > 0) {
			y = x * y;
			x -= 1;
		}
		
		if (x != 0) {
			y = y * x;
			x += 1;
		}else {
			if (y > 0)
				System.out.println(y);
			else
				y = -y;

			System.out.println(y);
			
		}

		
	}
}
