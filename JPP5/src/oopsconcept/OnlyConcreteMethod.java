package oopsconcept;

abstract class abst3
{
	public void display2()
	{
		System.out.println("This is a display2 concrete method");
	}
}

class abst4 extends abst3
{
	public void display3()
	{
		System.out.println("This is display3 concrete method");
	}
}

public class OnlyConcreteMethod 
{
	public static void main(String[] args) 
	{
		abst3 a=new abst4();
		a.display2();
	}
}
