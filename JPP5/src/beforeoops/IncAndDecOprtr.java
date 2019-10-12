package beforeoops;

import java.util.Scanner;

public class IncAndDecOprtr {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt(); //10
		System.out.println("Post increment of n is: "+ (n++)); //10
		System.out.println("Post decrement of n is: "+ (n--)); //11
		System.out.println("Pre increment of n is: "+ (++n));  //11
		System.out.println("Pre decrement of n is: "+ (--n));  //10
	}
}
