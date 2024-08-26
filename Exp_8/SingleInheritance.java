class A
{
	int x;
	A(int i)
	{
		x=i;
	}
	void show()
	{
		System.out.println("x = "+x);
	}
}
class B extends A
{
	int y;
	B(int i,int j)
	{
		super(i);
		y=j;
	}
	void display()
	{
		show();
		System.out.println("y = "+y);
	}
}
class SingleInheritance
{
	public static void main(String args[])
	{
		A a=new A(5);
		a.show();
		B b=new B(1,10);
		b.display();
	}
}