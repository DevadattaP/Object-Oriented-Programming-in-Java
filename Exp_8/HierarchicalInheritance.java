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
class C extends A
{
	int z;
	C(int i, int j)
	{
		super(i);
		z=j;
	}
	void get()
	{
		show();
		System.out.println("z = "+z);
	}
}
class HierarchicalInheritance
{
	public static void main(String args[])
	{
		A a=new A(5);
		System.out.println("For object of class A:");
		a.show();
		B b=new B(4,6);
		System.out.println("For object of class B:");
		b.display();
		C c=new C(3,7);
		System.out.println("For object of class C:");
		c.get();
	}
}