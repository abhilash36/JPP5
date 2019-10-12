package beforeoops;

public class PrintAsciiOddValue 
{
	public static void main(String[] args) 
	{
		char ch='A';
		
		while(ch<='Z')
		{
			if(ch%2==1)
			{
				System.out.println(ch);
			}
			ch++;
		}
	}
}
