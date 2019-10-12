package beforeoops;

public class ThisKeyword 
{
 int i=10;
 public void test()
 {
	 int i=20;
	 System.out.println("Value of i is: "+i);
	 System.out.println("value of global variable i is: "+this.i);
 }
	public static void main(String[] args) 
	{
		ThisKeyword t=new ThisKeyword();
		t.test();
	}
}
