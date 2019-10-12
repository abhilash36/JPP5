package beforeoops;

public class Narrowing {

	public static void main(String[] args) 
	{
		double d=97.00;
		float f=(float)d;
		long l=(long)f;
		int i=(int)l;
		short s=(short)i;
		byte b=(byte)s;
		
		System.out.println("Byte value is: "+b);
		System.out.println("short value is: "+s);
		System.out.println("int value is: "+i);
		System.out.println("long value is: "+l);
		System.out.println("float value is: "+f);
		System.out.println("double value is: "+d);

	}

}
