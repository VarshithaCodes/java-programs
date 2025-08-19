package collections;

abstract class abstract_ex {
	abstract void example();
	abstract void message();

}
class msg extends abstract_ex
{
	void example()
	{
		System.out.println("This is example method");
	}
	void message()
	{
		System.out.println("this is message method");
	}
}

