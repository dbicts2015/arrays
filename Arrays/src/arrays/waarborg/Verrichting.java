package arrays.waarborg;

public class Verrichting {

	private final int bedrag;
	
	private final String datum;

	public Verrichting(int bedrag, String datum) {
		this.bedrag = bedrag;
		this.datum = datum;
	}

	public int getBedrag() {
		return bedrag;
	}

	public String getDatum() {
		return datum;
	}

}