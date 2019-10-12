package strings;

import java.util.Scanner;

public class CountSpecialCharacters 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		char[] ch=s1.toCharArray();
		
        int spcount=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(!(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z' || ch[i]>='0' && ch[i]<='9' || ch[i]==' '))
			{
				spcount++;
			}
		}
		System.out.println("Special characters present in the string "+s1+" is: "+spcount);
	}
}
