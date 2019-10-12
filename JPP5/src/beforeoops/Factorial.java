package beforeoops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		int fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		
		for(int i=2;i<=n;i++)
		{
			fact=fact*i;
		}
      System.out.println("Factorial of "+n+" is: "+fact);
	}

}
