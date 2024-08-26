class MyException extends Exception
{
	String desc;
	MyException(String d)
	{
		desc=d;
	}
	String showException()
	{
		return desc;
	}
}
class CheckException
{
	static void check(int n) throws MyException
	{
		if(n<0)
		{
			MyException me = new MyException("No negative input please");
			throw me;
		}
		else
			System.out.println("Positive is welcome");
	}
	public static void main(String[] args) 
	{
		try
		{
			int x =Integer.parseInt(args[0]);
			check(x);
		}
		catch(MyException e)
		{
			System.out.println(e.showException());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}