package speelkaarten;

import java.awt.Color;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		SpeelKaart hartenVijf = new SpeelKaart("harten", "vijf", Color.RED);
		JOptionPane.showMessageDialog(null, hartenVijf.getOmschrijving());
	}
}
