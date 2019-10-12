package oopsconcept;

abstract class abst1
{
	abstract void display1();
}

class abst2 extends abst1
{
	public void display1()
	{
		System.out.println("This is display1 method implementation");
	}
}

public class OnlyAbstClass 
{
	public static void main(String[] args) 
	{
		abst1 a1=new abst2();
		a1.display1();
	}
}
