abstract class A
{
	int x;
	A(int i)
	{
		x=i;
	}
	abstract void show();
	void display()
	{
		System.out.println("x = "+x);
	}
}
class B extends A
{
	B(int i)
	{
		super(i);
	}
	void show()
	{
		display();
		System.out.println("Class B extending abstract class A");
	}
}
class TestAbstract
{
	public static void main(String args[])
	{
		B b=new B(10);
		A a;
		a=b;
		a.show();
	}
}