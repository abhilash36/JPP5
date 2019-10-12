package strings;

import java.util.Scanner;

public class ReverseOnlyWords {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		String[] s2=s1.split(" ");
		
		String rev="";
		
		for(int i=s2.length-1;i>=0;i--)
		{
			rev=rev+" "+s2[i];
		}
     System.out.println("Result is: "+rev);
	}

}
