package Project;

public class Continue_Statement
{
	public static void main(String args[])
	{
		
        int i;
		for (i = 0; i < 10; i++)
        {
			if (i == 5)
            {
				continue;
            }    
			System.out.println("Integer Numbers = " + i);
		}
		System.out.println("Outside of the Loop");
	}
}
/*
OUTPUT
 
Integer Numbers = 0
Integer Numbers = 1
Integer Numbers = 2
Integer Numbers = 3
Integer Numbers = 4
Integer Numbers = 6
Integer Numbers = 7
Integer Numbers = 8
Integer Numbers = 9
Outside of the Loop

 */