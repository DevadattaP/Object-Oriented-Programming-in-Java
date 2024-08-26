class TryFinally
{
	public static void main(String args[])
	{
		try
		{
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			System.out.println("Division = "+(x/y));
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("\nExecuting finally\n");
		}
	}
}