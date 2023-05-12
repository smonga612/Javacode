class mythread extends Thread
{
int n;
public mythread(int n)
{
this.n=n;
}

public void run()
{
int i;
for(i=1;i<=10;i++)
{
try
{
System.out.println(n+" * "+i+" = "+i*n);
Thread.sleep(1000);
}catch(Exception e)
{
}
}
}
}
class test
{
public static void main(String args[])
{

mythread t1=new mythread(10);
t1.start();
mythread t2=new mythread(5);
t2.start();
}
}