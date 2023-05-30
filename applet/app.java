import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;

public class app extends Applet
{
Color c1,c2;
public void init()
{
c1=new Color(255,0,0);
c2=new Color(0,0,255);
System.out.println("Inside init method");
}

public void start()
{
System.out.println("Inside start method");
}

public void paint(Graphics g)
{
//setBackground(Color.RED);
g.setColor(c1);
g.drawString("Welcome to applet",100,100);
g.setColor(c1);
//g.fillRect(200,200,100,50);
//g.drawOval(100,100,50,50);
//g.fillOval(100,100,50,50);
//g.drawLine(25,25,300,25);
g.fillArc(100,100,50,50,0,180);
g.setColor(c2);

g.fillArc(100,100,50,50,180,180);
System.out.println("Inside paint method");
}
public void stop()
{
System.out.println("Inside stop method");
}
public void destroy()
{
System.out.println("Inside destroy method");
}

}