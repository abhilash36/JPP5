package arrays;

import java.util.Scanner;

public class PrintBtwnMaxAndMin {

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
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
		 if(a[i]>max)
		  {
			max=a[i];
		  }
		}
		
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
      
		System.out.println("Numbers present between maximum & minimum element of an array is:");
		for(int i=0;i<a.length;i++)
		{
		 if(a[i]!=max && a[i]!=min)
	     {
		  System.out.println(a[i]);	
		 }
	   }
	}

}
