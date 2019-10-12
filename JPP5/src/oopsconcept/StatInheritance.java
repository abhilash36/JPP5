package oopsconcept;

class ancientculture 
{
	public static void culture()
	{
		System.out.println("This is richest culture of the world");
	}
}


class hindu extends ancientculture
{
	public static void Temples()
	{
		System.out.println("Temples are the peacefull places");
	}
}


public class StatInheritance 
{
	public static void main(String[] args) 
	{
		hindu.culture();
	    hindu.Temples();
	}
}
