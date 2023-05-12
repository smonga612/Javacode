import java.util.Scanner;
class math
{
int ans;
void add(int x,int y)
{
ans=x+y;
}
void sub(int x,int y)
{
ans=x-y;
}
void mul(int x,int y)
{
ans=x*y;
}
void div(int x,int y)
{
ans=x/y;
}
int getans()
{
return(ans);
}
}
class mathprg
{
public static void main(String args[])
{
Scanner in =new Scanner(System.in);
int x,y;
System.out.println("Enter the number 1");
x=in.nextInt();
System.out.println("Enter the number 2");
y=in.nextInt();

math m1=new math();
m1.add(x,y);
System.out.println("Addition Result is "+m1.getans());

try
{
m1.div(x,y);
System.out.println("Divison Result is "+m1.getans());

} catch(ArithmeticException ae)
{
System.out.println("No result : Denominator Number is Zero");
}


m1.sub(x,y);
System.out.println("Subtract Result is "+m1.getans());

m1.mul(x,y);
System.out.println("Multiplication Result is "+m1.getans());

}

}