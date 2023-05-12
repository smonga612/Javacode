class testexp
{
void run() throws IllegalAccessException
{
System.out.println("Inside run");
//throw new IllegalAccessException();
}
}

class test
{
public static void main(String args[]) throws IllegalAccessException
{
testexp t=new testexp();
t.run();
System.out.println("Inside main");
}
}
