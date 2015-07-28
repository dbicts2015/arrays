package arrays.sterretjes;

import javax.swing.JOptionPane;

/**
 * 
Schrijf een klasse Rekening. In de constructor moet je het beginsaldo kunnen
meegeven. Voorzie een methode om een bedrag(int) te storten en een methode om een bedrag
af te halen van de rekening. Zorg ook een methode waarmee je een string kunt opvragen die
een reeks *-tekens teruggeeft (geefSterretjes). Wanneer er op de rekening een bedrag tussen 0
en 999 staat, moet er 1 sterretje worden teruggegeven. Wanneer er een bedrag tussen 1000 en
1999 staat, moeten er 2 sterretjes worden teruggegeven, enz.
Je kunt dit uittesten met de de volgende main-methode. Wanneer je als bedrag 500 ingeeft,
zou de volgende output moeten verschijnen
 * @author user104
 *
 */
public class Main {

	public static void main(String[] args) {
		Rekening[] rekeningen = new Rekening[2];
		rekeningen[0] = new Rekening(1000);
		rekeningen[1] = new Rekening(5000);
		int bedrag = Integer.parseInt(JOptionPane.showInputDialog(
				"Geef over te schrijven bedrag"));
		rekeningen[0].haalGeldAf(bedrag);
		rekeningen[1].stortGeld(bedrag);
		for (int i = 0; i < 2; i++) {
			System.out.format("Rek%1$d: %2$s\n", i + 1,
					rekeningen[i].geefSterretjes());
		}
		
		
		Bank b = new Bank(1000, 5000);
		bedrag = Integer.parseInt(JOptionPane.showInputDialog(
				"Geef over te schrijven bedrag"));
		b.schrijfOver(0, 1, bedrag);
		for (int i = 0; i < 2; i++) {
			System.out.format("Rek%1$d: %2$s\n", i + 1, b.geefSterretjes(i));
		}
	}

}