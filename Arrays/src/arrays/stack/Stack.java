package arrays.stack;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Stack<T> implements Iterable<T> {

	private Deque<T> stack = new LinkedList<>();// niet static want elke tabel heeft nu
										// zedelfde...
	private int top = 0;
	
	public void push(T x) {
		stack.push(x);
	}

	public T pop() {
		return stack.pop();
	}

	public T peek() {
		return stack.peek();
	}

	@Override
	public Iterator<T> iterator() {
		return stack.iterator();
	}

}
