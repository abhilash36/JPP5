package oopsconcept;

class constchain1
{
	constchain1()
	{
		System.out.println("This is the default constructor");
	}
}

class constchain2 extends constchain1
{
	constchain2(int a)
	{
		super();
		System.out.println("This is an integer constructor");
	}
}

class constchain3 extends constchain2
{
	constchain3(double b)
	{
		super(10);
		System.out.println("This is double constructor");
	}
}

public class ConstChaining 
{
	public static void main(String[] args) 
	{
		constchain3 c=new constchain3(98.90);
	}
}
