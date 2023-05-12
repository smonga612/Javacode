class test
{
public static void main(String args[])
{
int a=1;
int b=-1;
int c=0;
try
{
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=a+b;
System.out.println("Addition is "+c);
c=a/b;
System.out.println("After divison execute the code");

}
catch(Exception ae)
{
System.out.println("Stopped due to some error...."+ae.getMessage());
ae.printStackTrace();
}

finally
{
System.out.println("Division is "+c);
}
System.out.println("Program rest code....");

}
}