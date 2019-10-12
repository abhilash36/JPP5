package sorting;

import java.util.Scanner;

public class SelectionSort 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
      
        System.out.println("After sorting, array elements are: ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
