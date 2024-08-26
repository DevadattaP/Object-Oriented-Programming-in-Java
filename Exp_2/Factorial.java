import java.io.*;
class Factorial 
{
    public static void main(String args[]) throws IOException 
    {
        int n,fact=1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++)
            fact=fact*i;
        System.out.println(n+" factorial = "+fact);
    }
}
