import java.awt.*;
import java.awt.event.*;


class myframe extends Frame implements MouseListener,MouseMotionListener
{
int x,y;

myframe()
{

setSize(800,600);
setVisible(true);
addMouseListener(this);
addMouseMotionListener(this);
}
public void paint(Graphics g)
{
g.drawString("X: "+x+"Y: "+y,x,y);
//g.drawRect(10,10,100,100);

}

public void mouseMoved(MouseEvent me)
{

setBackground(Color.GREEN);
x=me.getX();
y=me.getY();
repaint();
System.out.println("Inside Mouse moved Method"+me.getX()+" "+me.getY());

}

public void mouseDragged(MouseEvent me)
{
setBackground(Color.ORANGE);
System.out.println("Inside Mouse dragged Method");

}

public void mouseExited(MouseEvent me)
{
setBackground(Color.WHITE);
System.out.println("Inside Mouse Exit Method");

}
public void mouseEntered(MouseEvent me)
{
setBackground(Color.RED);
System.out.println("Inside Mouse enter Method");

}

public void mouseReleased(MouseEvent me)
{
setBackground(Color.BLUE);

System.out.println("Inside Mouse released Method");
}
public void mousePressed(MouseEvent me)
{
setBackground(Color.BLACK);

System.out.println("Inside Mouse pressed Method");

}

public void mouseClicked(MouseEvent me)
{
System.out.println("Inside Mouse clicked Method");

}

}

class testframe
{
public static void main(String args[])
{
myframe mf=new myframe();

}
}

