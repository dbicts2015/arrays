package arrays.begroting;

public class Begroting {

	private final int[] inkomsten;
	private final int[] uitgaven;
	
	private int teller_inkomsten;
	private int teller_uitgaven;

	public Begroting(int n_inkomsten, int n_uitgaven) {
		this.inkomsten = new int[n_inkomsten];
		this.uitgaven = new int[n_uitgaven];
	}

	public void voegInkomstToe(int bedrag) {
		this.inkomsten[teller_inkomsten++] = bedrag;
	}

	public void voegUitgaveToe(int bedrag) {
		this.uitgaven[teller_uitgaven++] = bedrag;
	}

	public String presenteerBegroting() {
		StringBuilder builder = new StringBuilder();
		builder.append("Inkomsten: \n");
		for (int i = 0; i < inkomsten.length; i++) {
			builder.append("- ").append(inkomsten[i]).append("\n");
		}
		builder.append("Uitgaven: \n");
		for (int i = 0; i < uitgaven.length; i++) {
			builder.append("- ").append(uitgaven[i]).append("\n");
		}
		return builder.toString();
	}


}