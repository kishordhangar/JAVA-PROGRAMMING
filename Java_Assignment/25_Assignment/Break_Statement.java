
//9. Write a program to demonstrate usage of break and continue in java . 
import java.lang.*;
class Break_Statement
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
