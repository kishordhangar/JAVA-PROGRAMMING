import java.lang.*;

class Equals_Method_Second
{

    public static void main (String args[])
    {
        String s1 = "Hello";
        String s2 = new String("Hello");  //2nd way of print string

        if(s1 == s2) // string 2 type ne print keli mhnun he ans chukich dakhavatay eth
                        // Next example madhe equals method use ahe tyamule output
                        // pn correct aalay tith
        {
            System.out.println("\nBoth Strings Are Equals\n");
        }
        else
        {
            System.out.println("\nBoth Strings are Different\n");

        }
    }
}