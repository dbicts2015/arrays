package speelkaarten;

import javax.swing.*;

public class KlaverenDrie {
	public static void main(String[] args) {
		SpeelKaart klaverenDrie;
		klaverenDrie = new SpeelKaart();

		klaverenDrie.setKleur("Klaveren");
		klaverenDrie.setWaarde("Drie");

		JOptionPane.showMessageDialog(null, klaverenDrie.getKleur() + " "
				+ klaverenDrie.getWaarde());

		JOptionPane.showMessageDialog(null, klaverenDrie.getOmschrijving());
		
		// opmerking terzijde: je bent niet verplicht om iets te doen met het resultaat 
		// van een methode:
		klaverenDrie.getOmschrijving();  
	}
}