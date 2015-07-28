package arrays.waarborg;

/**
 * obp06: schrijf een klasse “GewaarborgdeRekening”. In de constructor geef je mee hoeveel
stortingen je wil doen op de rekening. Via de methode stortBedrag kun je het bedrag van een
storting op de rekening (int) meegeven en een datum (String). De methode geefStortingen
geeft een string terug met een overzicht van de stortingen (bedragen + datums). De methode
geefTerugbetaaldBedrag geeft het totale bedrag op de rekening terug, tenzij het groter is dan
100000. De gewaarborgde rekening geeft maximum 100000 EUR terug. De rest ben je kwijt.
De klasse moet werken met de volgende main-methode:
 public static void main(String[] args) {
 GewaarborgdeRekening rek =
 new GewaarborgdeRekening(3);
 rek.stortBedrag(50000, "06/10/2008");
 rek.stortBedrag(30000,"08/10/2008");
 rek.stortBedrag(60000, "13/10/2008");
 System.out.print(rek.geefStortingen());
 System.out.format("U krijgt %1$d EUR terug",
 rek.geefTerugbetaaldBedrag());
 }
De out put van deze main methode is:
Op 06/10/2008 werd 50000 gestort.
Op 08/10/2008 werd 30000 gestort.
Op 13/10/2008 werd 60000 gestort.
U krijgt 100000 EUR terug.



 * @author user104
 *
 */
public class GewaarborgdeRekening {
	
	private int teller;
	private final Verrichting[] verrichtingen;

	public GewaarborgdeRekening(int grootte) {
		this.verrichtingen = new Verrichting[5];
	}

	public void stortBedrag(int bedrag, String datum) {
		verrichtingen[teller++] = new Verrichting(bedrag, datum);
	}

	public String geefStortingen() {
		StringBuilder builder = new StringBuilder();
		for (Verrichting verrichting : verrichtingen) {
			builder.append("Op ").append(verrichting.getDatum()).append(" werd ");
			builder.append(verrichting.getBedrag()).append(" gestort.\n");
		}
		return builder.toString();
	}

	public Object geefTerugbetaaldBedrag() {
		int totaal = 0;
		for (Verrichting verrichting : verrichtingen) {
			totaal += verrichting.getBedrag();
		}
		return totaal > 10000 ? 100000 : totaal;
	}

}