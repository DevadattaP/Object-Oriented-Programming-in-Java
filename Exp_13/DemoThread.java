class First implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("A:"+i);
		System.out.println("A stopped");
	}
}
class Second implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("B:"+i);
		System.out.println("B stopped");
	}
}
class DemoThread
{
	public static void main(String[] args) 
	{
		First f=new First();
		Second s=new Second();
		Thread t1=new Thread(f);
		Thread t2=new Thread(s);
		t1.start();
		t2.start();
	}
}