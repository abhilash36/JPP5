package wrapperclasses;

public class PrimitiveToNon 
{
	public static void main(String[] args) 
	{
		byte b=97;
		short s=b;
		int i=s;
		long l=i;
		float f=l;
		double d=f;
		
		System.out.println("Byte value is: "+Byte.valueOf(b));
		System.out.println("Short value is: "+Short.valueOf(s));
		System.out.println("Int value is: "+Integer.valueOf(i));
		System.out.println("Long value is: "+Long.valueOf(l));
		System.out.println("Float value is: "+Float.valueOf(f));
		System.out.println("Double value is: "+Double.valueOf(d));

	}

}
