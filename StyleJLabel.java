import java.awt.*;
import javax.swing.*;
public class StyleJLabel
{
  StyleJLabel()
  {
    JFrame frame = new JFrame();
    frame.setLayout(new GridLayout(4,1));
  
    JLabel label = new JLabel("This is a label!", SwingConstants.CENTER);
    label.setFont(new Font("Serif", Font.BOLD, 20));
    label.setForeground(Color.RED);
    label.setBackground(Color.ORANGE);
    label.setOpaque(true);
  
    frame.add(label); 
    frame.setSize(300,150);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
   public static void main(String[] args)
   {
     new StyleJLabel();
   }
}