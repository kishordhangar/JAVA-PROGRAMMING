//write a program to close the frame an anonymous inner class
// craeting a frame and closing it.
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
    public static void main(String []args)
    {
        //create a frame with title
        MyFrame f = new MyFrame();

        //set a title for the Frame
        f.setTitle("my AWT 5th frame");

        //set the size of the frame
        f.setSize(300,250);

        //display the frame
        f.setVisible(true);

        //close the frame here myclass is not mentioned
        //but its object is passed to the method
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);

            }
        });

    }
}