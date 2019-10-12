package beforeoops;

import java.util.Scanner;

public class RecursiveFactorial 
{
	public static int Factorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n*Factorial(n-1);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		int res=Factorial(n);
		System.out.println("Factorial of "+n+" is: "+res);
	}
}
