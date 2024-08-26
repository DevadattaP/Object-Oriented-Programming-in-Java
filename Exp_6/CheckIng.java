import java.util.*;
class CheckIng
{
	public static boolean check(String s)
	{
		return (s.endsWith("ing"));
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		if(CheckIng.check(s))
			System.out.println(s+" ends with ing");
		else
			System.out.println(s+" does not end with ing");
		sc.close();
	}
}