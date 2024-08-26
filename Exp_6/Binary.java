import java.util.*;
class Binary
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int n=sc.nextInt();
		sc.close();
		int a[]=new int[10];
		int i;
		for(i=0;n>0;i++)
		{
			a[i]=n%2;    
			n=n/2;
		}
		System.out.println("Binary equivalent number= ");
		for(i=i-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
	}
}