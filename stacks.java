package collections;

import java.util.Stack;

public class stacks {
	public static void main(String[] args)
	{
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		stack.push(65);
		stack.push(87);
		stack.push(34);
		stack.push(1);
		System.out.println("Stack elements after pushing"+stack);
		int popped=stack.pop();
		System.out.println("stack after pop:"+stack);
	}

}
