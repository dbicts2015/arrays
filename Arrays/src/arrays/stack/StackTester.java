package arrays.stack;

public class StackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack1 = new Stack<>();
		
		//int getalJOptionPane.showInputDialog("geef getal in");
		stack1.push(1);
		stack1.push(3);
		stack1.push(7);
		stack1.push(85);
		stack1.push(26);
		stack1.push(2);
		stack1.push(3);
		stack1.push(7);
		stack1.push(85);
		stack1.push(26);
		stack1.push(2);
		stack1.push(3);
		stack1.push(7);
		stack1.push(85);
		stack1.push(26);
		stack1.push(2);
		stack1.push(3);
		stack1.push(7);
		stack1.push(85);
		stack1.push(26);
		stack1.push(2);
		stack1.push(3);
		stack1.push(7);
		stack1.push(85);
		stack1.push(26);
		stack1.push(2);
		stack1.push(3);
		stack1.push(7);
		stack1.push(85);
		stack1.push(26);
		stack1.push(2);
		stack1.push(3);
		stack1.push(7);
		stack1.push(85);
		stack1.push(26);
		stack1.push(85);
		stack1.push(26);
		stack1.push(2);
		stack1.push(3);
		stack1.push(7);
		stack1.push(85);
		stack1.push(26);
		stack1.push(2);
		stack1.push(3);
		stack1.push(7);
		stack1.push(85);
		stack1.push(26);
		stack1.push(7);
		stack1.push(85);
		
		
		
		
		int test =stack1.pop();
		System.out.println(test);
		stack1.push(95);
		stack1.push(11);
		
		int test2 =stack1.pop();
		System.out.println(test2);
		
		int test3 =stack1.pop();
		System.out.println(test3);
		Stack<Integer> stack2 = new Stack<>();
		stack2.push(2);
		stack2.push(3);
		stack2.push(7);
		stack2.push(85);
		stack2.push(26);
		stack2.push(41);
		
		int test4=stack2.pop();
		System.out.println(test4);
		
		int kijken = stack2.peek();
		System.out.println(kijken);

	}

}
