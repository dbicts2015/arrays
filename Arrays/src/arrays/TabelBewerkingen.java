// TabelBewerkingen.java

package arrays;

import java.util.Arrays;

public class TabelBewerkingen {
	public static void vullen(int[] tabel) {
		for (int i = 0; i < tabel.length; i++) {
			tabel[i] = (int) (Math.random() * 1000.0);
		}
	}

	public static void drukken(int[] tabel) {
		for (int i = 0; i < tabel.length; i++) {
			System.out.print(tabel[i] + " ");
		}
	}

	public static long sommeren(int[] tabel) {
		long totaal = 0;
		for (int i = 0; i < tabel.length; i++) {
			totaal = totaal + tabel[i];
		}
		return totaal;
	}

	public static int kleinste(int[] tabel) {
		int kleinste = tabel[0];
		for (int i = 1; i < tabel.length; i++) {
			if (tabel[i] < kleinste) {
				kleinste = tabel[i];
			}
		}
		return kleinste;
	}

}