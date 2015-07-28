package arrays.huistaak;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PostnummerLijst {

	/**
	 * De tabel van postnummers
	 */
	private final Postnummer[] postnummers = new Postnummer[5];

	/**
	 * De index van de volgende plaats in postnummers
	 */
	private int index;

	/**
	 * Voeg een nieuwe postnummer toe als er nog plaats is. Anders gebeurt
	 * er niets.
	 * 
	 * @param postnummer
	 */
	public void add(Postnummer postnummer) {
		if (index < postnummers.length) {
			postnummers[index++] = postnummer;
		}
		// throw new ArrayIndexOutOfBoundsException("Geen plaats meer in postnummers");
	}

	/**
	 * Sorteert alfabetisch op gemeentenaam
	 */
	public void sorteerAlfabetisch() {
		Collections.sort(Arrays.asList(postnummers), new Comparator<Postnummer>() {

			@Override
			public int compare(Postnummer o1, Postnummer o2) {
				if (o1 == null || o2 == null) {
					return o1 == null ? -1 : 1;
				}
				return o1.getGemeentenaam().compareTo(o2.getGemeentenaam());
			}
			
		});
	}

	/**
	 * Sorteert op postcodes
	 */
	public void sorteerPostcodes() {
		Collections.sort(Arrays.asList(postnummers), new Comparator<Postnummer>() {

			@Override
			public int compare(Postnummer o1, Postnummer o2) {
				if (o1 == null || o2 == null) {
					return o1 == null ? -1 : 1;
				}
				return o1.getPostcode().compareTo(o2.getPostcode());
			}
			
		});
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Postnummer nummer : postnummers) {
			if (nummer == null) {
				continue;
			}
			builder.append(nummer.getGemeentenaam()).append(" met postbus ");
			builder.append(nummer.getPostcode()).append("\n");
		}
		return builder.toString();
	}

}