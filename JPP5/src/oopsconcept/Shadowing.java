package oopsconcept;

class laptop
{
	public static void os()
	{
		System.out.println("This is win-7 os");
	}
}

class touchscreenlaptop extends laptop
{
	public static void os()
	{
		System.out.println("This is win-10 os");
	}
}

public class Shadowing {

	public static void main(String[] args) 
	{
		touchscreenlaptop t=new touchscreenlaptop();
		t.os();
	}
}
