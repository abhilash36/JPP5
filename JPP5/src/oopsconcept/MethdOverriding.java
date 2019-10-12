package oopsconcept;

class Gen1lifespan
{
	int age;
	public void age(int age)
	{
		this.age=age;
		System.out.println("lifespan of generation 1 is: "+age+" years");
	}
}

class Gen2lifespan extends Gen1lifespan
{
	int age;
	public void age(int age)
	{
		this.age=age;
		System.out.println("lifespan of generation 2 is: "+age+" years");
	}
}


class Gen3lifespan extends Gen2lifespan
{
	int age;
	public void age(int age)
	{
		this.age=age;
		System.out.println("lifespan of generation 3 is: "+age+" years");
	}
}

public class MethdOverriding 
{
	public static void main(String[] args) 
	{
		Gen3lifespan g=new Gen3lifespan();
		g.age(60);
	}
}
