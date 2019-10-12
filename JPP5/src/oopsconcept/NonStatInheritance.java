package oopsconcept;

class gentswear
{
	public void gentscloths()
	{
		System.out.println("This is parent class");
	}
}

class gentshirts extends gentswear
{
	public void formals()
	{
		System.out.println("This is sub class");
	}
}

public class NonStatInheritance {

	public static void main(String[] args)
	{
		gentshirts g=new gentshirts();
		g.formals();
		g.gentscloths();
	}
}
