/*
 * TestSpeelkaartenBoek.java
 */

package speelkaarten;

public class TestSpeelkaartenBoek {

	public static void main(String[] args) {
		SpeelkaartenBoek boek = new SpeelkaartenBoek();
		System.out.println("kaarten na creatie van speelkaartenboek:");
		for (int kaart = 1; kaart <= boek.getAantalKaarten(); kaart++) {
			SpeelKaart speelkaart = boek.geefKaart();
			System.out.println(speelkaart.getOmschrijving());
		}
		boek.schud();
		System.out.println("\nkaarten na schudden van speelkaartenboek:");
		for (int kaart = 1; kaart <= boek.getAantalKaarten(); kaart++) {
			System.out.println(boek.geefKaart().getOmschrijving());
		}
	}
}
