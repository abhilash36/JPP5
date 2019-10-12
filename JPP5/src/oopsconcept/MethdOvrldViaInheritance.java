package oopsconcept;

class phones
{
	public void landline()
	{
		System.out.println("This is the parent class");
	}
}

class smartphones extends phones
{
	public void mobile()
	{
		System.out.println("This is the child class");
	}
}


public class MethdOvrldViaInheritance 
{
	public static void main(String[] args) 
	{
		smartphones s=new smartphones();
		s.mobile();
		s.landline();
	}
}
