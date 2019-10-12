package arrays;

import java.util.Scanner;

public class InsertOnlyOddNum {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("Enter an starting value");
		int num=s.nextInt();
		
		for(int i=0,j=num;i<a.length;j++)
		{
			if(j%2==1)
			{
				a[i]=j;
				i++;
			}
		}
		
       System.out.println("Elements present in an array are: ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
