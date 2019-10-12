package beforeoops;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		boolean found=false;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				found=true;
				break;
			}
		}
		
		if(!found)
		System.out.println(n+" is a prime number");
		else
		System.out.println(n+" is not a prime number");
	}
}
