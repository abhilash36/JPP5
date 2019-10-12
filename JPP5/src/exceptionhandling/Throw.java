package exceptionhandling;

public class Throw {

	public static void main(String[] args) 
	{
		System.out.println(1);
		System.out.println(2);
		
		if(1==1)
		{
			throw new ArithmeticException();
		}
		
		System.out.println(3);
		System.out.println(4);
	}
}
