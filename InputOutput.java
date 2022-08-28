 
 
 // BufferedReader he Scanf sarkh work karat


import java.io.*; 
import java.awt.*;
class InputOutput
{
    public static void main(String args[]) throws IOException
    {

        BufferedReader brobj = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter ID :");
        int id = Integer.parseInt(brobj.readLine());
        System.out.println("ID :"+id);
        
        System.out.print("Enter ID2 :");
        int id2 = Integer.parseInt(brobj.readLine());
        System.out.println("ID2 :"+id2);

        int addition = id + id2;

        System.out.println("Addition ="+addition);


        Frame f1 = new Frame();
        f1.setSize(400,400);
        f1.setVisible(true);
        f1.setTitle("hii");



    }
}