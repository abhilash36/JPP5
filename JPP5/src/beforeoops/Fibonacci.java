package beforeoops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
     System.out.println("Sum of "+n+" numbers is: "+sum);
	}

}
