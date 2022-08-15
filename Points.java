//write a program to display several dots on black screen

//Displaying a group of dots on black screen

import java.awt.*;
import java.awt.event.*;
class Points extends Frame
{    
    public void paint(Graphics g)
    {
        //set white colors for dots
        g.setColor(Color.white);

        //display dots forever
        for(;;)
        {
            
            //generate x,y, coordinates randomly. ,maximum 800 and 600 px
            int x = (int) (Math.random() * 800);
            int y = (int) (Math.random() * 600);
            
            
            //Use drawingLine() to display a dot
            g.drawLine(x,y,x,y);
            try{
                //make a time delay of 20 milliseconds
                Thread.sleep(20);
            }catch(InterruptedException ie){}
        }
    }
    public static void main(String args[])
    {
        
        //create a frame
        Points obj = new Points();

        

        //set black background color for frame
        obj.setBackground(Color.darkGray);

        //set the size and title for frame
        obj.setSize(400,400);
        obj.setTitle("RANDOM DOTS");

        //display the frame
        obj.setVisible(true);

    }
}