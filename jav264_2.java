class adder
{
int result;
void add(int ...a)
{
result=0;
for (int b : a) 
result=result+b;
}

int getresult()
{
return(result);
}
}

class adderimp
{
public static void main(String args[])
{
adder a1=new adder();
a1.add(2,3);
System.out.println("Result is "+a1.getresult());
a1.add(2,3,4);
System.out.println("Result is "+a1.getresult());
a1.add(2,3,4,5);
System.out.println("Result is "+a1.getresult());
a1.add(2);
System.out.println("Result is "+a1.getresult());

}
}