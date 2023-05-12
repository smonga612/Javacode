abstract class shape
{
float area;
void print_area()
{
System.out.println(this.getClass());
System.out.println("Area : "+area);
}
abstract void area(float a,float b);
}

class rectangle extends shape
{
void area(float l,float b)
{
area=l*b;
}
}

class triangle extends shape
{
void area(float h,float b)
{
area=0.5f*h*b;
}
}
class testshape
{
public static void main(String args[])
{
shape s1;
s1=new rectangle();
s1.area(22.6f,7.4f);
s1.print_area();
s1=new triangle();
s1.area(3.6f,56.7f);
s1.print_area();

}

}


