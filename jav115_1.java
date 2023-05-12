class voter
{
void getstatus(int age)
{
if (age < 18)
throw new ArithmeticException("Invalid Age");
else
System.out.println("Valid Age");
}
}
class test
{
public static void main(String args[])
{
voter v1=new voter();
try
{
v1.getstatus(25);
}
catch(ArithmeticException ae)
{
System.out.println("Invalid Age");
}
System.out.println("Program rest code");

}
}
