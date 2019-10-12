package strings;

import java.util.Scanner;

public class GivenCharIsPresentInStringOrNot 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		char[] ch=s1.toCharArray();
		
		System.out.println("Enter the character that need to search");
		
		char se=s.next().charAt(0);
		
		boolean found=false;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==se)
			{
				found=true;
				break;
			}
		}
		
		if(found)
			System.out.println("given character "+se+" is found");
		else
			System.out.println("given character "+se+" is not found");
	}
}
