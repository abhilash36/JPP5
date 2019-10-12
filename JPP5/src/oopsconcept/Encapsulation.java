package oopsconcept;

class stddetails
{
	private int rollnum=1;
	private String name="abhilash";
	private double marks=80.50;
	
	public int getRollnum()
	{
		return rollnum;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setMarks(double marks)
	{
		this.marks=marks;
	}
	
	public double getMarks()
	{
		return marks;
	}
}
public class Encapsulation 
{
	public static void main(String[] args) 
	{
		stddetails s=new stddetails();
		System.out.println("Student roll number is: "+s.getRollnum());
		s.setName("Surya");
		System.out.println("Updated Student name is: "+s.getName());
		s.setMarks(98);
		System.out.println("Updated student marks is: "+s.getMarks());
	}
}
