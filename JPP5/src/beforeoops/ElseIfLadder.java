package beforeoops;

import java.util.Scanner;

public class ElseIfLadder {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a,b,c & d");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		
		if(a>b && a>c && a>d)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c && b>d)
		{
			System.out.println("b is greater");
		}
		else if(c>a && c>b && c>d)
		{
			System.out.println("c is greater");
		}
		else
		{
			System.out.println("d is greater");
		}
	}
}
