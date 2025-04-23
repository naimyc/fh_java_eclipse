package com.programmierenJava02.uebung1;

public class Aufgabe2 {

	public Aufgabe2() {
		// TODO Auto-generated constructor stub
		
	}
	
	class Auto
	{
		private String name, hersteller;
		private int baujahr;
		/**
		 * @param name
		 * @param hersteller
		 * @param baujahr
		 */
		public Auto(String name, String hersteller, int baujahr) {
			this.name = name;
			this.hersteller = hersteller;
			this.baujahr = baujahr;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getHersteller() {
			return hersteller;
		}
		public void setHersteller(String hersteller) {
			this.hersteller = hersteller;
		}
		public int getBaujahr() {
			return baujahr;
		}
		public void setBaujahr(int baujahr) {
			this.baujahr = baujahr;
		}	
	}

}
