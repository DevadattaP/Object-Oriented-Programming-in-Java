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
class ExceptionCheck extends MyException
{
	ExceptionCheck(String s)
	{
		super(s);
	}
	String printException()
	{
		return super.showException();
	}
}
class CheckException1
{
	static void check(int n) throws ExceptionCheck
	{
		if(n<0)
		{
			ExceptionCheck me = new ExceptionCheck("No negative input please");
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
		catch(ExceptionCheck e)
		{
			System.out.println(e.printException());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}