package collections;

public class stack_op {
	public static void main(String[] args)
	{
		mystack stack=new mystack(5);
		stack.push(87);
		stack.push(54);
		stack.push(12);
		stack.push(7);
		stack.push(9);
		stack.push(23);
		stack.display();
		System.out.println("The top element"+stack.peek(0));
		System.out.println("pop element in stack:"+stack.pop(0));
		stack.display();
		System.out.println("is stack empty!!"+stack.isEmpty());
		System.out.println("is stack full!!"+stack.isEmpty()                            );
	}

}
class mystack
{
	int maxsize;
	int [] stackarray;
	int top;
	public mystack(int size)
	{
		maxsize=size;
		stackarray=new int[maxsize];
		top=-1;
	}
	public void push(int value)
	{
		if(isFull())
		{
			System.out.println("stack is full");
		}
		else
		{
			stackarray[++top]=value;
			System.out.println(value+"pushed into stack");
		}
	}
	public int pop(int value)
	{
		if(isEmpty())
		{
			System.out.println("stack is empty cannot pop");
			return -1;
		}
		else
		{
			return stackarray[top--];
		}
	}
	public int peek(int value)
	{
		if(isEmpty())
		{
			System.out.println("stack is empty cannot peek");
			return -1;
		}
		else
		{
			return stackarray[top];
		}
	}
	public boolean isEmpty()
	{
		return (top==-1);
	}
	public boolean isFull()
	{
		return (top==maxsize-1);
	}
	public int size()

	{
		return top+1;
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty!!!");
		}
		else
		{
			System.out.println("stack elemnts are:");
			for(int i=0;i<top;i++)
			{
				System.err.println(stackarray[i]+" ");
			}
			System.out.println();
		}
	}
}

