package arrays.huistaak;

/**
 * Ontwerp een klasse om van een postnummer de code en de gemeentenaam
 * te kunnen bewaren.
 * Ontwerp een tweede klasse om een lijst van 5 postnummers te kunnen
 * maken. De lijst moet gesorteerd kunnen worden op postcode of op
 * gemeentenaam
 * 
 * @author Hannes Lowette
 *
 */
public class Main {

	public static void main(String[] args) {
		PostnummerLijst lijst = new PostnummerLijst();

		/*
		 * Voeg 5 items toe
		 */
		lijst.add(new Postnummer("2570", "Duffel"));
		lijst.add(new Postnummer("2500", "Lier"));
		lijst.add(new Postnummer("3000", "Leuven"));
		lijst.add(new Postnummer("3030", "Lolkweeni"));
		lijst.add(new Postnummer("4884", "DL"));
		
		/*
		 * Voeg 1 extra item toe en kijk of hij exception geeft (nee)
		 */
		lijst.add(new Postnummer("9876", "zzzz"));
		
		/*
		 * Print lijst
		 */
		System.out.println(lijst);
		
		/*
		 * Sorteer alfabetisch en print
		 */
		lijst.sorteerAlfabetisch();
		System.out.println(lijst);
		
		/*
		 * Sorteer op postcode en print
		 */
		lijst.sorteerPostcodes();
		System.out.println(lijst);
	}

}