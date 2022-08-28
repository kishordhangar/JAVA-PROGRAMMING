import java.lang.*;
class Equals_method_Third
{
    public static void main(String args[])
    {
        String s1 = "Hello";
        String s2 = new String("Hello");

        if(s1.equals(s2)) // this method to cheack content of string..
                          //String jr barobar asel tr correct ways ne output print hot                       
        {
            System.out.println("\nBoth Strings Are Equal\n");

        }
        else
        {
            System.out.println("\nBoth Strings Are Different\n");
        }
    }
}