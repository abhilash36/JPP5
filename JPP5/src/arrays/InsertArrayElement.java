package arrays;

import java.util.Scanner;

public class InsertArrayElement 
{
	public static void display(int[] a)
	{
		System.out.println("Before update, array elements are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static int[] InsertElement(int[] a,int in,int num)
	{
		if(in<0 && in>a.length)
		{
			System.out.println("invalid index");
			return a;
		}
		else
		{
			int[] na=new int[a.length+1];
			
			for(int i=0;i<in;i++)
			{
				na[i]=a[i];
			}
			
			na[in]=num;
			
			for(int i=in;i<a.length;i++)
			{
				na[i+1]=a[i];
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
		
		System.out.println("Enter the position of an array that need to insert");
		int in=s.nextInt();
		
		System.out.println("Enter the number that needs to insert in the index"+in);
		int num=s.nextInt();

		a=InsertElement(a,in,num);
		
        System.out.println("After update, array elements are: ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
