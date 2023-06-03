import javax.swing.*;

class myframe extends JFrame
{
myframe()
{
setSize(800,600);
setVisible(true);
setTitle("Swing frame");
setLayout(null);
}
void designform()
{
JButton b1=new JButton("Ok");
b1.setBounds(100,100,120,50);
add(b1);

}

}

class testframe 
{
public static void main(String args[])
{
myframe mf1=new myframe();
mf1.designform();

}
}