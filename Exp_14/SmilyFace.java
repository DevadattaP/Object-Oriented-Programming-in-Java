/*
<applet code="SmilyFace.class" width="500" height="300">
</applet>
*/
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class SmilyFace extends Applet 
{
    public void paint(Graphics g)
    {
        g.setColor(Color.orange);
        g.fillOval(75,40,150,150);
        g.setColor(Color.white);
        g.fillOval(110,75,25,25);
        g.fillOval(160,75,25,25);
        g.setColor(Color.black);
	  g.drawLine(150, 105, 150, 125);
        g.drawLine(150, 125, 160, 125);
        g.drawOval(110,75,25,25);
        g.drawOval(160,75,25,25);
        g.fillOval(118,84,10,10);
        g.fillOval(168,84,10,10);
        g.setColor(Color.white);
        g.fillArc(110, 110, 80, 50, 0,-180);
        g.setColor(Color.orange);
        g.fillArc(110, 123, 80, 20,0,-180);
        g.setColor(Color.red);
        g.drawArc(110, 110, 80, 50, 0,-180);
        g.drawArc(110, 123, 80, 20,0,-180);
    }
}