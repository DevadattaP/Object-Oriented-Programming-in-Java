class HandleException
{
	public static void main(String args[])
	{
		try
		{
			int a =Integer.parseInt(args[0]);
			int b =Integer.parseInt(args[1]);
			System.out.println("Division = "+(a/b));
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("Tested OK");
	}
}