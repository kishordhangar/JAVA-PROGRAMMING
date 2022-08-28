import java.lang.*;

class Substring_Method1
{
public static void main(String args[])
{

    String s1 = " Hello Welcome";
    String s2 = " Hello Welcome";
    String s3 = " Hello Welcome";
    String s4 = " Hello Welcome";
    String s5 = " Hello Welcome";
    

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);


    s1= s1.substring(0,5)+"World"; /*ya thikani substring hi method string chi 
                                    arrayindex vaparun apalyala tya string madhe 
                                    kuth ani kay add karaych yasathi help karte*/
    System.out.println(s1);

     s2= s2.substring(0,7)+"World";
    System.out.println(s2);

     s3= s3.substring(0,8)+"World";
    System.out.println(s3);

     s4= s4.substring(0,9)+"World";
    System.out.println(s4);

     s5= s5.substring(0,10)+"World";
    System.out.println(s5);
}


}