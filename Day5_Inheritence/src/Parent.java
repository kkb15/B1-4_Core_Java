class Single
{
	void print()
	{
		System.out.println("Hello,This is Shiwani");
	}
}
class Child extends Single
{
	void display()
	{
		System.out.println("Single Inheritance");
	}
}
class Parent
{

	public static void main(String[] args)
	{
		Child c=new Child();
		c.display();
		c.print();

	}

}