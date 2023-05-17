class mythread implements Runnable
{
public void run()
{
int i;
for(i=1;i<=20;i++)
{
if (i%2==0)
System.out.println(i +" is even number  "+Thread.currentThread());
}

}

}
class mythread_1 implements Runnable
{
public void run()
{
int j;
for(j=100;j<=120;j++)
{
if (j%2==0)
System.out.println(j +" is even number "+Thread.currentThread());
}

}

}



class testthread
{
public static void main(String args[])
{

mythread mt1=new mythread(); //First Task
mythread_1 mt2=new mythread_1();//Second Task
Thread t1=new Thread(mt1,"First Thread");
Thread t2=new Thread(mt2,"Second Thread");
Thread t3=new Thread(mt1,"Third Thread");
t1.start();
t2.start();
t3.start();
}
}