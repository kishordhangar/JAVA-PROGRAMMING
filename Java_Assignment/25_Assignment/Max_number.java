package Project;
import java.io.*;
public class Max_number 
{
	public static void main(String argc[]) throws IOException 
    {
					BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                    System.out.print("Enter integer i value = ");
                    int i = Integer.parseInt(obj.readLine());

                    System.out.print("Enter integer j value = ");
                    int j = Integer.parseInt(obj.readLine());

                    if(i>j)
                    {
                         System.out.println("INTEGER i IS GREATER THAN INTEGER j = "+i);
                    }
                    else
                    {
                    	System.out.println("Wrong Input");
                    }
                    
    }


}
/*
OUTPUT
Enter integer i value = 11
Enter integer j value = 10
INTEGER i IS GREATER THAN INTEGER j = 11
 

 */
