package beforeoops;

public class Widening 
{

	public static void main(String[] args) 
	{
		byte b=97;
		short s=b;
		int i=s;
		long l=i;
		float f=l;
		double d=f;
		
		System.out.println("Byte value is: "+b);
		System.out.println("short value is: "+s);
		System.out.println("int value is: "+i);
		System.out.println("long value is: "+l);
		System.out.println("float value is: "+f);
		System.out.println("double value is: "+d);
	}

}
