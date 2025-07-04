package gpt_aufaben.smarthome_system;

public class SmartHome {
	public static void main(String[] args) {
		Steuerbar l = new Lampe();
		
		l.einschalten();
		
		TemperaturRegelbar h = new Heizung();
		
		h.setzeTemperatur(22);
		
	}
}
