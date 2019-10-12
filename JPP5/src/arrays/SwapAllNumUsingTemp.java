package arrays;

import java.util.Scanner;

public class SwapAllNumUsingTemp {

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
		
		System.out.println("Before swapping,Array elements are: ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		int temp=0;
		
		for(int i=0;i<a.length/2;i++)
		{
		  temp=a[i];
		  a[i]=a[a.length-i-1];
		  a[a.length-i-1]=temp;
		}
  
		System.out.println("After swapping, array elements are: ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
