package wrapperclasses;

public class NonToPrimitive {

	public static void main(String[] args) 
	{
		Byte b=97;
		Short s=80;
		Integer i=97;
		Character c='A';
		Float f=87.98f;
		Double d=98.78;
		
		System.out.println("byte value is: "+b.byteValue());
		System.out.println("short value is: "+s.shortValue());
		System.out.println("int value is: "+i.intValue());
		System.out.println("long value is: "+c.charValue());
		System.out.println("float value is: "+f.floatValue());
		System.out.println("double value is: "+d.doubleValue());
	}
}
