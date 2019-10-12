package oopsconcept;

class bookdetails
{
	String bname="classmate";
	double cost=65.80;
	int pages=100;
	
	bookdetails()
	{
		
	}
	
	bookdetails(String bname,double cost,int pages)
	{
		this.bname=bname;
		this.cost=cost;
		this.pages=pages;
	}
	
	public String toString()
	{
		return "( bname:"+bname+",cost: "+cost+",pages: "+pages+")";
	}
	
	public boolean equals(Object obj)
	{
		return this.bname==((bookdetails)obj).bname &&
			   this.cost==((bookdetails)obj).cost &&
			   this.pages==((bookdetails)obj).pages;
	}
	
	public int hashcode()
	{
		int hc=0;
		hc=hc+bname.hashCode();
		hc=hc+(int)cost;
		hc=hc+pages;
		return hc;
	}
}
public class ToStringEqualsHashcode 
{
	public static void main(String[] args) 
	{
		bookdetails b1=new bookdetails("classmate",65.80,100);
		bookdetails b2=new bookdetails("vidya",70.80,120);
		bookdetails b3=new bookdetails("classmate",65.80,100);
		
		System.out.println("ToString value of b1 is: "+b1.toString());
		System.out.println("ToString value of b3 is: "+b3.toString());
		System.out.println("Result of comparision operator is: "+ b1.toString()==b3.toString());
		System.out.println("Result of equals operator is: "+ b1.toString().equals(b3.toString()));
		System.out.println("------------------------------------------------------------------------");
		
		System.out.println("Equals value of b1 is: "+b1);
		System.out.println("Equals value of b3 is: "+b3);
		System.out.println("Result of comparision operator is: "+(b1==b3));
		System.out.println("Result of equals operator is: "+ b1.equals(b3));
		System.out.println("------------------------------------------------------------------------");
		
		System.out.println("Hashcode value of b1 is: "+b1.hashcode());
		System.out.println("Hashcode value of b3 is: "+b3.hashcode());
		System.out.println("Result of comparision operator is: "+ (b1.hashcode()==b3.hashcode()));
	}
}
