package Project;
import java.io.*;

public class min_max {
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
                    else if(i<j)
                    {
                        System.out.println("INTEGER i IS Less THAN INTEGER j  = "+j);
                    }
                    else
                    {
                        System.out.println("Both integer are equals ");
                    }
    }

}

/*
OUTPUT
 
Enter integer i value = 10
Enter integer j value = 11
INTEGER i IS Less THAN INTEGER j  = 11

 */
