package oopsconcept;

class bottle
{
	public void waterbottle()
	{
		System.out.println("This is a parent class");
	}
}

class glassbottle extends bottle
{
	public void juicebottle()
	{
		System.out.println("This is a child class");
	}
}

public class Upcasting 
{
	public static void main(String[] args) 
	{
	 bottle b1=(bottle) new glassbottle();
	 b1.waterbottle();
	}
}
