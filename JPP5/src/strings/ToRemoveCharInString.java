package strings;

import java.util.Scanner;

public class ToRemoveCharInString 
{
	public static String remove(String str,int pos)
	{
		return str.substring(0,pos)+str.substring(1+pos);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		
		System.out.println("Enter the position of the character that need to remove");
		int pos=s.nextInt();
		
		String res=remove(s1,pos);

		System.out.println("Result is: "+res);
	}

}
