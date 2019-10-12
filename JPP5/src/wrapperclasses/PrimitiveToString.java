package wrapperclasses;

public class PrimitiveToString 
{
	public static void main(String[] args) 
	{
		byte b=97;
		short s=b;
		int i=s;
		long l=i;
		float f=l;
		double d=f;
		
		System.out.println("String value of byte is: "+String.valueOf(b));
		System.out.println("String value of short is: "+String.valueOf(s));
		System.out.println("String value of int is: "+String.valueOf(i));
		System.out.println("String value of long is: "+String.valueOf(l));
		System.out.println("String value of float is: "+String.valueOf(f));
		System.out.println("String value of double is: "+String.valueOf(d));
	}
}
