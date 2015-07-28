package arrays.sterretjes;

public class Bank {

	private final Rekening[] rekeningen;

	public Bank(int bedrag_1, int bedrag_2) {
		rekeningen = new Rekening[2];
		rekeningen[0] = new Rekening(bedrag_1);
		rekeningen[1] = new Rekening(bedrag_2);
	}

	public void schrijfOver(int van, int naar, int bedrag) {
		rekeningen[van].haalGeldAf(bedrag);
		rekeningen[naar].stortGeld(bedrag);
	}

	public String geefSterretjes(int i) {
		return rekeningen[i].geefSterretjes();
	}

}
