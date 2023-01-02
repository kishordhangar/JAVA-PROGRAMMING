package Project;

public class Break_Statement
{

	public static void main(String args[])
	{
		
        int i;
		for (i = 0; i < 10; i++)
        {
			// Terminate the loop when i is 5
			if (i == 5)
            {
				break;
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
Outside of the Loop

 
 */
