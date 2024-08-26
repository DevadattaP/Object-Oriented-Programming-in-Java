interface A
{
	int x=5;
	void show();
	void display();
}
interface B
{
	int y=10;
	void print();
}
class C implements A,B
{
	public void show()
	{
		System.out.println("Show from A");
	}
	public void display()
	{

		System.out.println("Display from A");
	}
	public void print()
	{
		
		System.out.println("Print from B");
	}
	public static void main(String args[])
	{
		C c=new C();
		c.show();
		c.display();
		c.print();
	}
}