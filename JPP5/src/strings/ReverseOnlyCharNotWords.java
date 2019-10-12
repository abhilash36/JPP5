package strings;

import java.util.Scanner;

public class ReverseOnlyCharNotWords 
{
  public static String reverse(String s1)
  {
	  String r="";
	  char[] ch=s1.trim().toCharArray();
	  
	  for(int i=ch.length-1;i>=0;i--)
	  {
		  r=r+ch[i];
	  }
	  return r;
  }
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		String[] s2=s1.split(" ");
		
		String rev="";
		
		for(int i=0;i<s2.length;i++)
		{
			rev=rev+" "+reverse(s2[i]);
		}
		
		System.out.println("Result is: "+rev);
	}
}
