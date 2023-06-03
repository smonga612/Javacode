import java.awt.*;
import java.awt.event.*;
class calc extends Frame implements ActionListener
{
Label l3;
TextField tf1,tf2;
calc(String title)
{
l3=new Label();
setVisible(true);
setSize(800,600);
setTitle(title);
setBackground(Color.YELLOW);
setLayout(null);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getActionCommand()=="Add")
{
int a,b,c;
a=Integer.parseInt(tf1.getText());
b=Integer.parseInt(tf2.getText());
c=a+b;
l3.setText("Result is  "+c);
}
else if(ae.getActionCommand()=="Subtract")
{
int a,b,c;
a=Integer.parseInt(tf1.getText());
b=Integer.parseInt(tf2.getText());
c=a-b;
l3.setText("Result is  "+c);
}
else
{
int a,b,c;
a=Integer.parseInt(tf1.getText());
b=Integer.parseInt(tf2.getText());
c=a*b;
l3.setText("Result is  "+c);
}
System.out.println(ae.getActionCommand());
}
void designform()
{
Label l1=new Label("Enter the First Number");
Label l2=new Label("Enter the Second Number");
tf1=new TextField(20);
tf2=new TextField(20);

Button b1=new Button("Add");
Button b2=new Button("Subtract");
Button b3=new Button("Multiplication");
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

l1.setBounds(200,100,150,20);
l2.setBounds(200,125,150,20);

tf1.setBounds(375,100,150,20);
tf2.setBounds(375,125,150,20);

b1.setBounds(200,150,150,20);
b2.setBounds(350,150,150,20);
b3.setBounds(475,150,150,20);

l3.setBounds(200,250,150,20);


add(l1);
add(l2);
add(tf1);
add(tf2);
add(b1);
add(b2);
add(l3);
add(b3);
}
}


class myframe
{
public static void main(String args[])
{
calc c1=new calc("Calculator");
c1.designform();

}
}