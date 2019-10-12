package strings;

import java.util.Scanner;

public class ConvertToLowerAndUpperCase 
{
 public static void main(String[] args) 
 {
	 Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		s1=s1.substring(0,2).toUpperCase()+s1.substring(2).toLowerCase();
		
		System.out.println("Result is: "+s1);
 }
}
