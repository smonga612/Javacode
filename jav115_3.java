final class shape
{
void area()
{
System.out.println("Inside shape area");
}
final void getdata()
{
System.out.println("Inside shape getdata");

}

}

class circle extends shape
{
void area()
{
System.out.println("Inside circle area");
}
void getdata1()
{
System.out.println("Inside circle getdata");

}

}

class test
{
public static void main(String args[])
{
circle c1=new circle();
c1.area();
c1.getdata();


}

}
