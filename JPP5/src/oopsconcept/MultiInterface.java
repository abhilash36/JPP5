package oopsconcept;

interface i1
{
	abstract void display1();
}

interface i2
{
	abstract void display2();
}

class c1 implements i1,i2
{
	public void display1()
	{
		System.out.println("This is display1 method");
	}
	
	public void display2()
	{
		System.out.println("This is display2 method");
	}
}

public class MultiInterface 
{
	public static void main(String[] args) 
	{
		c1 c=new c1();
		c.display1();
		c.display2();
	}
}
