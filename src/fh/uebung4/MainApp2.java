package fh.uebung4;

import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class MainApp2 {
	public static void main(String[] args) {
		String plattform = "";
		while (plattform.equals(""))
			plattform = JOptionPane.showInputDialog(null);
		int pass_length = -1;
		while (pass_length == -1) {
			String s = JOptionPane.showInputDialog("Gebe die Länge des Passworts ein");
			if (s.matches("\\d+"))
				pass_length = Integer.parseInt(s);
		}

		try (PrintWriter pw = new PrintWriter(new FileWriter("passwords.txt"))) {
			String random_pass = generatePassword(pass_length);
			pw.write(plattform + " = " + random_pass);
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println();
	}

	static String generatePassword(int passwordlength) {
		String password = new String();
		ArrayList<Character> allowedChars = new ArrayList<Character>();
		for (char i = 48; i < ((char) 'z') + 1; i++) {
			if (i == 58)
				i = 65;
			else if (i == 91)
				i = 97;
			allowedChars.add(i);
		}

		Random r = new Random(0);

		while (password.length() < passwordlength)
			password += allowedChars.get(r.nextInt(allowedChars.size() - 1));

		return password;
	}
}
