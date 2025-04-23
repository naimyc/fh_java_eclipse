package fh.uebung4;

public class Haus {
	private String str_name, stadt;
	private int haus_nr, plz;
	private double grundstuck_flaeche, wohnflaeche, preis;
	private boolean stellplatzVorhanden;
	
	
	@Override
	public String toString() {
		return String.format(
				"Haus [str_name=%s, stadt=%s, haus_nr=%s, plz=%s, grundstuck_flaeche=%s, wohnflaeche=%s, preis=%s, stellplatzVorhanden=%s]",
				str_name, stadt, haus_nr, plz, grundstuck_flaeche, wohnflaeche, preis, stellplatzVorhanden);
	}

	public String toCSV() {
		return String.format(
				"%s,%s,%s,%s,%s,%s,%s,%s",
				str_name, stadt, haus_nr, plz, grundstuck_flaeche, wohnflaeche, preis, stellplatzVorhanden);
	}
	
	public String getStr_name() {
		return str_name;
	}
	public void setStr_name(String str_name) {
		this.str_name = str_name;
	}
	public String getStadt() {
		return stadt;
	}
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	public int getHaus_nr() {
		return haus_nr;
	}
	public void setHaus_nr(int haus_nr) {
		this.haus_nr = haus_nr;
	}
	public int getPlz() {
		return plz;
	}
	public void setPlz(int plz) {
		this.plz = plz;
	}
	public double getGrundstuck_flaeche() {
		return grundstuck_flaeche;
	}
	public void setGrundstuck_flaeche(double grundstuck_flaeche) {
		this.grundstuck_flaeche = grundstuck_flaeche;
	}
	public double getWohnflaeche() {
		return wohnflaeche;
	}
	public void setWohnflaeche(double wohnflaeche) {
		this.wohnflaeche = wohnflaeche;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	public boolean isStellplatzVorhanden() {
		return stellplatzVorhanden;
	}
	public void setStellplatzVorhanden(boolean stellplatzVorhanden) {
		this.stellplatzVorhanden = stellplatzVorhanden;
	}
	/**
	 * @param str_name
	 * @param stadt
	 * @param haus_nr
	 * @param plz
	 * @param grundstuck_flaeche
	 * @param wohnflaeche
	 * @param preis
	 * @param stellplatzVorhanden
	 */
	public Haus(String str_name, String stadt, int haus_nr, int plz, double grundstuck_flaeche, double wohnflaeche,
			double preis, boolean stellplatzVorhanden) {
		this.str_name = str_name;
		this.stadt = stadt;
		this.haus_nr = haus_nr;
		this.plz = plz;
		this.grundstuck_flaeche = grundstuck_flaeche;
		this.wohnflaeche = wohnflaeche;
		this.preis = preis;
		this.stellplatzVorhanden = stellplatzVorhanden;
	}
	
	
	
}
