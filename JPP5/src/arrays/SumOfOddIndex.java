package arrays;

import java.util.Scanner;

public class SumOfOddIndex {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("Enter an array elements");
        
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2==1)
			{
				sum=sum+a[i];
			}
		}
      System.out.println("Sum of even index is: "+sum);

	}

}
