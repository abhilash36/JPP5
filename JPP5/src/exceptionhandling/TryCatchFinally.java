package exceptionhandling;

public class TryCatchFinally {

	public static void main(String[] args) 
	{
		int a=10,b=0;
		
		try
		{
			int res=a/b;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught");
		}
		
		finally
		{
			int c=a+b;
			System.out.println("Result is: "+c);
		}
	}

}
