//write a program to draw a smilling face using the methods of graphics class.
import java.awt.*;
import java.awt.event.*;
class Draw1 extends Frame
{
    Draw1()
    {
        //close the frame
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);

            }
        });
    }
    // to refresh the frame refresh the frame contents
    public void paint(Graphics g)
    {
        //set blue colour for drawing
        g.setColor(Color.blue);

        //display a rectangle to contain drawing
        g.drawRect(40,40,200,200);

        //face
        g.drawOval(90,70,80,80);

        //nose
        g.drawLine(130,95,130,115);

        //eyes
        g.drawOval(110,95,5,5);
        g.drawOval(145,95,5,5);

        //set mouth
        g.drawArc(113,115,35,20,0,-180);


    }
    public static void main(String args[])
    {
        //create a frame
        Draw1 d = new Draw1();

        //set the size And title
        d.setSize(400,400);
        d.setTitle("My drawing");

        //display the frame
        d.setVisible(true);

    }
}
