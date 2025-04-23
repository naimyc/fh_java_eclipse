package com.prakt7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadXML {
	static class Zitat {
		private String name, beschreibung;
		private String zitat = "";

		public String getZitat() {
			return zitat;
		}

		public void setZitat(String zitat) {
			this.zitat += zitat + "\n";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBeschreibung() {
			return beschreibung;
		}

		public void setBeschreibung(String beschreibung) {
			this.beschreibung = beschreibung;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new FileReader("zitate.xml"));
		PrintWriter out = new PrintWriter(new FileWriter("Zitate.txt"));

		String regex = "<(.*?)>(.*?)</\\1>";
		Pattern pattern = Pattern.compile(regex);
		ArrayList<Zitat> zitate = new ArrayList<ReadXML.Zitat>();

		try (Scanner sc = new Scanner(in)) {
			while (sc.hasNext()) {
				String data = sc.nextLine();
				if (data.contains("<person")) {
					Zitat z = new Zitat();
					while (true) {
						data = sc.nextLine();
						if (data.contains("/person"))
							break;
						Matcher matcher = pattern.matcher(data);

						if (matcher.find())
							if (data.contains("name"))
								z.setName(matcher.group(2));
							else if (data.contains("beschreibung"))
								z.setBeschreibung(matcher.group(2));
							else if (data.contains("zitat"))
								z.setZitat(matcher.group(2));
					}
					zitate.add(z);
				}

			}
			
			for(Zitat z : zitate) {
				String s = String.format("%s- %s,  %s\n\n", z.getZitat(),z.getName(), z.getBeschreibung());
				out.write(s);
			}
				
			
			out.flush();
			out.close();
		}

	}

}
