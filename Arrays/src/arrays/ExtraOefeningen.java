package arrays;

import java.util.Scanner;

public class ExtraOefeningen {

	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int input = scanner.nextInt();
			if (input == -1) {
				break;
			}
			array[input]++;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0)
				System.out.println(i + ": " + array[i]);
		}
		scanner.close();
	}

}