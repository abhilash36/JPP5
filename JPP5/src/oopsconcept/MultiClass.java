package oopsconcept;

interface i3
{
	abstract void display3();
}

class c2 implements i3
{
	public void display3()
	{
		System.out.println("This is display3 method");
	}
}

class c3 implements i3
{
	public void display3()
	{
		System.out.println("This is display3 method");
	}
}

public class MultiClass 
{
	public static void main(String[] args) 
	{
		c2 C2=new c2();
		C2.display3();
		System.out.println("------------------------------");
		c3 C3=new c3();
		C3.display3();
	}
}
