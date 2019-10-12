package oopsconcept;

class headset
{
	public void mobiles()
	{
		System.out.println("This is a parent class");
	}
}

class wiredheadset extends headset
{
	public void keypad()
	{
		System.out.println("This is child class");
	}
}

class wirelessheadset extends wiredheadset
{
	public void smartphones()
	{
		System.out.println("This is grand child class");
	}
}

public class DownCasting 
{

	public static void main(String[] args) 
	{
		wiredheadset w1=new wirelessheadset();
		wirelessheadset w2=(wirelessheadset) w1;
		w2.mobiles();
	    w2.keypad();
	    w2.smartphones();
	}
}
