package arrays.stack;

public class GenericStack<T> {

	@SuppressWarnings("unchecked")
	private T[] stack = (T[]) new Object[50];// niet static want elke tabel heeft nu
										// zedelfde...
	private int top = 0;

	public void push(T x) {
		stack[top] = x;
		if (++top >= 50) {
			throw new ArrayIndexOutOfBoundsException("top > " + stack.length + " (" + top + ")");
		}
	}

	public T pop() {
		T res = null;
		res = stack[top - 1];
		top = top - 1;
		return res;
	}

	public T peek() {
		T kijk = stack[top - 1];
		return kijk;
	}

}
