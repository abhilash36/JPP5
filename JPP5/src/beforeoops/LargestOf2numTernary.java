package beforeoops;

import java.util.Scanner;

public class LargestOf2numTernary {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a & b");
		int a=s.nextInt();
		int b=s.nextInt();
		
		char res=(a>b)?'a':'b';
		
		System.out.println(res+" is greater");

	}

}
