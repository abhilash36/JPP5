package oopsconcept;

class coverload
{
	int x;
	coverload(int a)
	{
		x=a;
		System.out.println("This is an integer constructor & its value is: "+x);
	}
	
	double y;
	coverload(double b)
	{
		y=b;
		System.out.println("This is the double constructor & its value is: "+y);
	}
	
	char z;
	coverload(char c)
	{
		z=c;
		System.out.println("This is the character constructor & its value is: "+z);
	}
	
}

public class ConstOverload 
{
	public static void main(String[] args) 
	{
		coverload c1=new coverload(10);
		coverload c2=new coverload(90.00);
		coverload c3=new coverload('z');
	}
}
