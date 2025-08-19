package collections;

interface interface_ex {
	void msg();
	void example();

}
class msg_ex implements interface_ex
{
	public void msg()
	{
		System.out.println("this is message method");
	}
	public void example()
	{
		System.out.println("this is example method");
	}
}
