import java.util.*;
class CountChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int upper=0,lower=0,space=0,digit=0,special=0;
		System.out.println("Enter a multiword string");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
				upper++;
			else if(Character.isLowerCase(s.charAt(i)))
				lower++;
			else if(Character.isDigit(s.charAt(i)))
				digit++;
			else if(Character.isWhitespace(s.charAt(i)))
				space++;
			else
				special++;
		}
		System.out.println("Uppercase letters="+upper);
		System.out.println("Lowercase letters="+lower);
		System.out.println("Digits="+digit);
		System.out.println("Space="+space);
		System.out.println("Special characters="+special);
		sc.close();
	}
}