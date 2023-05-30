import java.applet.Applet;
import java.awt.Graphics;
public class firstapp extends Applet
{
public void init()
{
System.out.println("Inside init method");
}
public void start()
{
System.out.println("Inside start method");
}
public void paint(Graphics g)
{
g.drawRect(10,10,100,300);
g.fillRect(10,10,100,300);
g.drawString("Welcome to Java Applet",100,100);
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