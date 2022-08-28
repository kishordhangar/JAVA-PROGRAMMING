



import java.lang.*;
class Lenght_Method
{
    public static void main(String args[])
    {
        String s1=" Hi Kishor";
        String s2=", How Are You";
        String s4= s1;
        String s3=s1.concat(s2);
        System.out.println(s3);

        int n  = s1.length();
        int n2 = s2.length();
        int n3 = s3.length();

        System.out.println("Length of s1 ="+n );
        System.out.println("Length of s2 ="+n2);
        System.out.println("Length of s3 ="+n3);

          System.out.println("Length of s1 =\n"+n + n2 + n3);
          System.out.println(s4);
    }
}















