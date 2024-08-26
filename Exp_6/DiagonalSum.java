import java.util.*;
class DiagonalSum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter elements in 3X3 matrix: ");
		int i,j,sumnd=0,sumd=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
				if(i==j)
					sumd+=a[i][j];
				else
					sumnd+=a[i][j];
			}
		}
		System.out.println("\nSum of diagonal elements = "+sumd);
		System.out.println("\nSum of non diagonal elements = "+sumnd);
	}
}