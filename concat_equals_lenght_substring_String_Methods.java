//All in one

/*
1. concat method
2. equals Method
3. lenght Method
4. substring Method
5 . simple String

*/

import java.lang.*;

class concat_equals_lenght_substring_String_Methods
{
    public static void main(String args[])
    {
        String s1="Hello World ";
        String s2="Hello World2 ";
        String s3="Hello World3 ";
        String s4="Hello World4";
        String s5="Hello World5";

System.out.println("***** concat Method *****");
        String s6=s1.concat(s2+s3); //concat mathod

        System.out.println("\n"+s6);
    System.out.println("\n***** Equals  Method *****");
        if(s2.equals(s3))     //equals method
        {
            System.out.println("Both Strings Are Equal\n");
        }
        else
        {
            System.out.println("Both Strings Are Different\n");
        }

        int n = s5.length();  //length method
        System.out.println("***** Length Method *****");
        System.out.println("Lenght os string s5= "+n);
        System.out.println("\n");


        s1=s1.substring(0,6)+"Kishor\n";   //substring method
        System.out.println("***** substring Method *****");
        System.out.println(s1);
         System.out.println("\n");
    }
}