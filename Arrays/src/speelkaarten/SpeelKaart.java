package speelkaarten;

import java.awt.Color;

public class SpeelKaart {
	private String kleur;
	private String waarde;
	private Color color;
	
	public SpeelKaart(){
	}

	public SpeelKaart(String kleur, String waarde, Color color) {
		this.kleur = kleur;
		this.waarde = waarde;
		this.setColor(color);
	}


	public String getKleur() {
		return kleur;
	}

	public void setKleur(String kleur) {
		this.kleur = kleur;
	}

	public String getWaarde() {
		return waarde;
	}

	public void setWaarde(String waarde) {
		this.waarde = waarde;
	}

	public String getOmschrijving() {
	//	return kleur + " " + waarde;
		String omschrijving = getKleur() +" "+ getWaarde();
		return omschrijving;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}