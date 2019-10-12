package strings;

import java.util.Scanner;

public class OccurranceOfCountOfEachChar 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		char[] ch=s1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			boolean duplicate=false;
			
			for(int j=0;j<=i-1;j++)
			{
				if(ch[j]==ch[i])
				{
				  duplicate=true;
				  break;
				}
			}
		
			
			if(!duplicate)
			{
				int count=0;
				
				for(int j=0;j<ch.length;j++)
				{
					if(ch[j]==ch[i])
					{
				      count++;		
					}
				}
			System.out.println("Occurance count of the character "+ch[i]+" present in the string"+s1+" is: "+count);
			}
		}
	}
}

