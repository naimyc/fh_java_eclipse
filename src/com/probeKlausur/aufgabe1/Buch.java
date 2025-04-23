package com.probeKlausur.aufgabe1;

import java.text.Format;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Buch {
	private String titel, autor, verlag;
	private int erscheinungsjahr, seitenzahl, alter;
	/**
	 * @param titel
	 * @param autor
	 * @param verlag
	 * @param erscheinungsjahr
	 * @param seitenzahl
	 */
	public Buch(String titel, String autor, String verlag, int erscheinungsjahr, int seitenzahl) {
		this.titel = titel;
		this.autor = autor;
		this.verlag = verlag;
		this.erscheinungsjahr = erscheinungsjahr;
		this.seitenzahl = seitenzahl;
		this.alter = getCurrentYear() - erscheinungsjahr;
	}
	public Buch() {
		// TODO Auto-generated constructor stub
	}
	private int getCurrentYear() {
		Calendar c = Calendar.getInstance();
	
		return c.get(Calendar.YEAR);
	}
	public String toTextFormat()
	{
		return String.format("%s-%s-%s-%d-%d-%d", autor, verlag, titel, erscheinungsjahr, alter, seitenzahl);
	}
	
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
		erscheinungsjahr = getCurrentYear() - alter;
	}
	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getVerlag() {
		return verlag;
	}

	public void setVerlag(String verlag) {
		this.verlag = verlag;
	}

	public int getErscheinungsjahr() {
		return erscheinungsjahr;
	}

	public void setErscheinungsjahr(int erscheinungsjahr) {
		this.erscheinungsjahr = erscheinungsjahr;
	}

	public int getSeitenzahl() {
		return seitenzahl;
	}

	public void setSeitenzahl(int seitenzahl) {
		this.seitenzahl = seitenzahl;
	}

}
