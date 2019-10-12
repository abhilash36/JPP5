package beforeoops;

public class PrintCharacters 
{
	public static void main(String[] args) 
	{
		char ch='A';
		
		while(ch<='Z')
		{
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			{
				System.out.println(ch++);
			}
		}

	}

}
