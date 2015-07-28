package arrays;


public class Main {

	public static void main(String[] args) {
		int[][] array = new int[args.length][];
		
		array[0] = new int[8];
		array[1] = new int[4];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].length);
		}
	}

}