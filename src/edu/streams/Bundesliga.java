package edu.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Bundesliga {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader("bundesliga.csv")))
		{
			String i = null;
			String txt = "";
			
			while((i = br.readLine()) != null)
				txt += i +"\n";
			
			getData(txt);
			
//			System.out.println(txt);
		}
		catch(IOException ex) {}
	}
	public static void getData(String csv) {

		String[] teams = csv.split("\n");
//		String[] teamNames = new String[5];
		ArrayList<String> teamD = new ArrayList<String>();
//		int[] teamPoints = new int[5];
		
		for (int i = 0; i < teams.length; i++) {
			
			String[] teamData = teams[i].split(";");
			
			System.out.println("Team "+ i);
			int points = 0;
			
			for (int j = 1; j < teamData.length; j++) {
				System.out.println(teamData[j]);
				String[] match = teamData[j].trim().split(":");
				
				int team01 = Integer.parseInt(match[0]);
				int team02 = Integer.parseInt(match[1]);
				
				 try {
	                    int goalsFor = Integer.parseInt(match[0].trim());
	                    int goalsAgainst = Integer.parseInt(match[1].trim());

	                    if (goalsFor > goalsAgainst) points += 3;
	                    else if (goalsFor == goalsAgainst) points += 1;

	                } catch (NumberFormatException e) {
	                    // Ungültiger Eintrag – überspringen
	                    continue;
	                }
			}
			
			teamD.add(teamData[0] + ": " + points);
		} 
		
		for (String string : teamD) {
			System.out.println(string);
		}
		
	}
	

}
