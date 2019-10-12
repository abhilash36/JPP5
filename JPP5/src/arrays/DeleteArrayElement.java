package arrays;

import java.util.Scanner;

public class DeleteArrayElement 
{
	public static void display(int[] a)
	{
		System.out.println("Before update, array elements are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static int[] DeleteElement(int[] a,int in)
	{
		if(in<0 && in>a.length)
		{
			System.out.println("Invalid index");
			return a;
		}
		
		else
		{
			int[] na=new int[a.length-1];
			
			for(int i=0;i<in;i++)
			{
				na[i]=a[i];
			}
			
			for(int i=in;i<na.length;i++)
			{
				na[i]=a[i+1];
			}
			return na;
		} 
	}

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=s.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter an array elemnets");
		for(int i=0;i<a.length;i++)
		{
	      a[i]=s.nextInt();
		}
		
		display(a);
		
		System.out.println("Enter the index of the element needs to delete");
		
		int in=s.nextInt();
		
		a=DeleteElement(a,in);
		
		System.out.println("After update, array elements are: ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
