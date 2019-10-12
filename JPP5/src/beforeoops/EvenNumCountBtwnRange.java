package beforeoops;

import java.util.Scanner;

public class EvenNumCountBtwnRange 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the start value of num");
		int snum=s.nextInt();
		System.out.println("Enter the end value of num");
		int lnum=s.nextInt();
		
		int count=0;
		
		for(int i=snum;i<=lnum;i++)
		{
			if(i%2==0)
			{
		      count++;		
			}
		}
    System.out.println("even numbers count between the range "+snum+" and "+lnum+" is: "+count);
	}

}
