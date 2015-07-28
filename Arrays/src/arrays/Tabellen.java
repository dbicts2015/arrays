// Tabellen.java

package arrays;
public class Tabellen {
	public static void main(String[] args) {
		long resultaat;
		int[] getallen = new int[10];
		TabelBewerkingen.vullen(getallen);
		TabelBewerkingen.drukken(getallen);
		resultaat = TabelBewerkingen.sommeren(getallen);
		System.out.println('\n' + "Som = " + resultaat);
		System.out.println("Minimum = " + TabelBewerkingen.kleinste(getallen));
	}
}