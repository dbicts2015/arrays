package arrays.waarborg;

public class Main {
	
	public static void main(String[] args) {
		GewaarborgdeRekening rek = new GewaarborgdeRekening(3);
		rek.stortBedrag(1000, "06/10/2008");
		rek.stortBedrag(3000, "08/10/2008");
		rek.stortBedrag(6000, "13/10/2008");
		System.out.print(rek.geefStortingen());
		System.out.format("U krijgt %1$d EUR terug", rek.geefTerugbetaaldBedrag());
	}

}