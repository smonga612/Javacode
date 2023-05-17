class mythread_1 extends Thread
{
public void run()
{
int i;
for(i=1;i<=10;i++)
{
try
{
System.out.println("Value of i is "+i);
Thread.sleep(1000);
} catch(Exception e)
{
}

}

}
}

class mythread_2 extends Thread
{
public void run()
{
int j;
for(j=10;j>0;j--)
{
try
{
System.out.println("Value of j is "+j);
Thread.sleep(1000);
} catch(Exception e)
{
}
}
}


}

class testthread
{
public static void main(String args[])
{
mythread_1 mt1=new mythread_1();
mythread_2 mt2=new mythread_2();
mt1.start();
mt2.start();

}
}