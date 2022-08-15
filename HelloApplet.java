package applets;

import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("deprecation")
public class HelloApplet extends Applet {

 public void paint(Graphics g) {
 g.drawString("Hello from www.TestingDocs.com", 25, 25);
 }
}