import java.awt.*;
class empframe extends Frame
{

empframe(String title)
{
setVisible(true);
setSize(800,600);
setTitle(title);
setLayout(null);
}

void designform()
{
Label l1=new Label("Enter the First Number");
Label l2=new Label("Enter the Second Number");
TextField tf1=new TextField(20);
TextField tf2=new TextField(20);

Button b1=new Button("Add");
Button b2=new Button("Subtract");


l1.setBounds(200,100,150,20);
l2.setBounds(200,125,150,20);

tf1.setBounds(375,100,150,20);
tf2.setBounds(375,125,150,20);

b1.setBounds(200,150,150,20);
b2.setBounds(350,150,150,20);


add(l1);
add(l2);
add(tf1);
add(tf2);
add(b1);
add(b2);

}
}


class myframe
{
public static void main(String args[])
{
empframe e1=new empframe("Employee Profile Page");
e1.designform();

}
}