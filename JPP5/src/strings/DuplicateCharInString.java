package strings;

import java.util.Scanner;

public class DuplicateCharInString {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		char[] ch=s1.toCharArray();
		
		System.out.println("Duplicate characters in the string "+s1+" are: ");
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
				
				if(count>1)
				{
					System.out.println(ch[i]);
				}
			}
		}

	}

}
