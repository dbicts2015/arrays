package arrays.stack;

public class Lol {

	public static void main(String[] args) {
		GenericStack<Integer> integers = new GenericStack<>();
		integers.push(10);
		
		GenericStack<Stack<Integer>> koeien = new GenericStack<>();
		koeien.push(new Stack<Integer>());
	}

}