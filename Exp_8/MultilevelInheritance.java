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
class C extends B
{
	int z;
	C(int i, int j, int k)
	{
		super(i,j);
		z=k;
	}
	void get()
	{
		display();
		System.out.println("z = "+z);
	}
}
class MultilevelInheritance
{
	public static void main(String args[])
	{
		A a=new A(5);
		System.out.println("For object of class A:");
		a.show();
		B b=new B(4,6);
		System.out.println("For object of class B:");
		b.display();
		C c=new C(3,7,10);
		System.out.println("For object of class C:");
		c.get();
	}
}