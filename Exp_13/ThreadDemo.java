class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("A:"+i);
		System.out.println("A stopped");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("B:"+i);
		System.out.println("B stopped");
	}
}
class ThreadDemo
{
	public static void main(String[] args) 
	{
		A a=new A();
		B b=new B();
		a.start();
		b.start();
	}
}