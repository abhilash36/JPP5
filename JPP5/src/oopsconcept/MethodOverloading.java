package oopsconcept;

public class MethodOverloading 
 {
  public void animal()
  {
	  System.out.println("This is parent class");
  }
  
  public void dog()
  {
	  System.out.println("This is child class");
  }
  
  public void puppy()
  {
	  System.out.println("This is grand child class");
  }
  
  
	public static void main(String[] args) 
	{
		MethodOverloading m=new MethodOverloading();
		m.puppy();
		m.dog();
		m.animal();
	}
}
