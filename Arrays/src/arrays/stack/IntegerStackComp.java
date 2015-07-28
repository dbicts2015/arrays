package arrays.stack;

public class IntegerStackComp {

	private final Stack<Integer> stack = new Stack<>();

	public void push(Integer x) {
		stack.push(x);
	}

	public Integer pop() {
		return stack.pop();
	}

	public Integer peek() {
		return stack.peek();
	}

}
