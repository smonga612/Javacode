class A 
{
int a;
A()
{
System.out.println("Inside A's Default Constructor");
}
A(int a)
{
this.a=a;
System.out.println("Inside A's Parameter Constructor");
}
0

void setA(int a)
{
this.a=a;
}
int getA()
{
return(a);
}
}

class B extends A
{

int b;
B()
{
System.out.println("Inside B's Default Constructor");
}
B(int b)
{
super(b);
this.b=b;
System.out.println("Inside B's Parameter Constructor");
}



void setB(int b)
{
this.b=b;
}
int getB()
{
return(b);

}
}

class C extends B
{

int c;
C()
{
System.out.println("Inside C's Default Constructor");
}

C(int c)
{
super(c);
this.c=c;
System.out.println("Inside C's Parameter Constructor");

}

void setC(int c)
{
this.c=c;
}
int getC()
{
return(c);
}
}

class testinht
{
public static void main(String args[])
{
C c1=new C(12);
//c1.setA(12);
//c1.setB(43);
//c1.setC(89);
System.out.println(c1.getA()+c1.getB()+c1.getC());
}
}