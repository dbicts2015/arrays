package speelkaarten;

import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;

public class SpeelkaartenBoek {

	
	public static final int AANTAL_KAARTEN = 52;
	
	public static final char[] KLEUREN = {'\u2665', '\u2663', '\u2666', '\u2660' };
	public static final Color[] COLORS = {Color.RED, Color.BLACK, Color.RED, Color.BLACK};

	private int index = 0;

	private final SpeelKaart[] kaarten = new SpeelKaart[AANTAL_KAARTEN];

	public SpeelkaartenBoek() {
		for (int i = 0; i < KLEUREN.length; i++) {
			for (int j = 0; j < 13; j++) {
				kaarten[i * 13 + j] = new SpeelKaart(
						new String(new char[] {KLEUREN[i]}), getWaarde(j), COLORS[i]);
			}
		}
	}

	public int getAantalKaarten() {
		return kaarten.length;
	}

	public SpeelKaart geefKaart() {
		return kaarten[index++ % kaarten.length];
	}

	public void schud() {
		Collections.shuffle(Arrays.asList(kaarten));
	}

	private String getWaarde(int i) {
		switch (i) {
		case 10:
			return "Boer";
		case 11:
			return "Dame";
		case 12:
			return "Heer";
		case 0:
			return "Aas";
		default:
			return String.valueOf(i);
		}
	}

}
