package arrays.sterretjes;

public class Rekening {

	private int saldo;

	public Rekening(int saldo) {
		this.saldo = saldo;
	}

	public void haalGeldAf(int bedrag) {
		saldo -= bedrag;
	}

	public String geefSterretjes() {
		StringBuilder bldr = new StringBuilder();
		for (int i = 0; i < 1 + saldo / 1000; i++) {
			bldr.append("*");
		}
		return bldr.toString();
	}

	public void stortGeld(int bedrag) {
		saldo += bedrag;
	}

}
