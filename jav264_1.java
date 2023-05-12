class adder
{
float fresult;
int result;
void add(int a,int b)
{
result=a+b;
}

void  add(float a,float b)
{
fresult=a*b;
}
int getresult()
{
return(result);
}
float getfresult()
{
return(fresult);
}

}
class testadder
{
public static void main(String args[])
{
adder a1=new adder();
//a1.add(2,3,4);
//System.out.println(a1.getresult());
a1.add(3.2f,4.5f);
System.out.println(a1.getfresult());

}
}
