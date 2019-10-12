package wrapperclasses;

public class StringToPrimitive 
{
	public static void main(String[] args) 
	{
		String s="97";
		
		System.out.println("String to byte is: "+Byte.parseByte(s));
		System.out.println("String to short is: "+Short.parseShort(s));
		System.out.println("String to int is: "+Integer.parseInt(s));
		System.out.println("String to long is: "+Long.parseLong(s));
		System.out.println("String to Float is: "+Float.parseFloat(s));
		System.out.println("String to Double is: "+Double.parseDouble(s));
	}
}
