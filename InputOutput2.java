import java.io.*;
import java.lang.*;
class InputOutput2
{
    public static void main(String argc[]) throws IOException
    {
    
    BufferedReader obj1 = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Hello:");
    int id = Integer.parseInt(obj1.readLine());
    System.out.println("Hello:"+id);
    }
}