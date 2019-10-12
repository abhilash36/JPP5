package strings;

import java.util.Scanner;

public class CountLengthVtoutInbuiltTryCatch 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		char[] ch=s1.toCharArray();
		int count=0;
		
		try
		{
		 for(int i=0;true;i++)
		 {
			 if((ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z' || ch[i]>='0' && ch[i]<='9' || ch[i]==' ')||
			   !(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z' || ch[i]>='0' && ch[i]<='9' || ch[i]==' ')) 
			 {
				 count++;
			 }
		 }
	   }
		
		catch(Exception e)
		{
			
		}
		
		System.out.println("Length of the given string is: "+count);
	}
}
