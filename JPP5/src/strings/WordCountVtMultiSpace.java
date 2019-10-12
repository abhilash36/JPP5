package strings;

import java.util.Scanner;

public class WordCountVtMultiSpace 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		
		char[] ch=s1.toCharArray();
		
		int count=1;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ' && ch[i+1]!=' ')
			{
			  count++;	
			}
		}
    System.out.println("Total words present in the string "+s1+" are: "+count);
	}
}
