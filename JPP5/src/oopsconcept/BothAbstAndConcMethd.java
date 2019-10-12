package oopsconcept;

abstract class abst5
{
	abstract void display5();
	
	public void display6()
	{
		System.out.println("This is display6 concrete method");
	}
}

class abst6 extends abst5
{
	public void display5()
	{
		System.out.println("This is display5 method implementation");
	}
}

public class BothAbstAndConcMethd 
{
	public static void main(String[] args) 
	{
	  abst5 a=new abst6();
	  a.display5();
	  a.display6();
	}
}
