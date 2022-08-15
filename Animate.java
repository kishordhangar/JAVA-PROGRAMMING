// Animation in applets
import java.awt.*;
import java.applet.*;
import java.awt.Graphics.*;
public class Animate extends Applet
{
    public void paint(Graphics g)
    {
        //load the image into image object img
        Image img = getImage(getDocumentBase(),"plane.gif");

        // move the image left to write by chnaging
        // x coordinates from 0 to 800px and take y coordinate as 0
        for(int x=0; x<800; x++)
        {
            g.drawImage(img,x,0,null);
        try{
            Thread.sleep(20);
            //dipaly for 20 milliseconds
           }catch(InterruptedException e){}
        }
    }
}