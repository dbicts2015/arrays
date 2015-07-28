package arrays.huistaak;

public class Postnummer {

	/**
	 * De postcode van de gemeente voor deze postnummer
	 */
	private final String postcode;
	
	/**
	 * De naam van de gemeente voor deze postnummer
	 */
	private final String gemeentenaam;

	/**
	 * Maak een nieuwe postnummer aan met een gegeven postcode en gemeentenaam
	 * 
	 * @param postcode
	 * @param gemeentenaam
	 */
	public Postnummer(String postcode, String gemeentenaam) {
		this.postcode = postcode;
		this.gemeentenaam = gemeentenaam;
	}

	public String getPostcode() {
		return postcode;
	}

	public String getGemeentenaam() {
		return gemeentenaam;
	}

}