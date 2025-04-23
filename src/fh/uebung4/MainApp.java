package fh.uebung4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class MainApp {
	public static void main(String[] args) {
		Haus h1 = new Haus("Leopoldstr", "Dortmund", 0, 0, 0, 0, 0, false);
		Haus h2 = new Haus("Münsterstr", "Münster", 0, 0, 0, 0, 0, false);
		Haus h3 = new Haus("Musterstr", "Musterstadt", 0, 0, 0, 0, 0, false);
		
		Haus[] haeuser = {h1,h2,h3};
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("häuser.csv")))
		{
			for(Haus h : haeuser)
				bw.write(h.toCSV()+"\n");
			bw.flush();
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader("häuser.csv"))){
			String s = new  String(), text = new String();
			Haus[] new_haeuser = new Haus[3];
			int i = 0;
			
			while((s = br.readLine()) != null)
			{
				String[] data = s.trim().split(",");
				String str = data[0], stadt = data[1];
				int haus_nr = Integer.parseInt(data[2]), plz = Integer.parseInt(data[3]);
				double grund_flaeche = Double.parseDouble(data[4]),wohn_flaeche = Double.parseDouble(data[5]), preis = Double.parseDouble(data[6]);
				boolean  stplz_voh = Boolean.parseBoolean(data[7]);
				
				new_haeuser[i] = new Haus(str, stadt, haus_nr, plz, grund_flaeche, wohn_flaeche, preis, stplz_voh);
				i++;
			}
			
			for(Haus h : new_haeuser)
			{
				System.out.println(h.toString());
			}
			
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
