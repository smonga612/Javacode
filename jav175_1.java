interface square
{
public int calculate(int x);
}

class testthread
{
public static void main(String args[])
{
square s1=(x)->x*x*x;
System.out.println(s1.calculate(2));

}
}