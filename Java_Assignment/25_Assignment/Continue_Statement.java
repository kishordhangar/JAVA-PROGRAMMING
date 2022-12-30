
//9. Write a program to demonstrate usage of break and continue in java . 
import java.lang.*;
class Continue_Statement
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
