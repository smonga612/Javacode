class atmservice implements Runnable
{
int balance=1000;
public void run()
{
Thread t=Thread.currentThread();
getMoney(t.getName());
}
synchronized void getMoney(String name)
{
System.out.println("Login by user "+name);
if(balance ==1000)
{
System.out.println("Transaction Done by "+name);
balance=balance-1000;
System.out.println("Rs 1000 withdraw by "+name + "and new balance is "+balance);
}
else
{
System.out.println("Insufficent Balance for " +name);
}
}
}

class atmimp
{
public static void main(String args[])
{
atmservice a1=new atmservice();
Thread t1=new Thread(a1);
Thread t2=new Thread(a1);
t1.setName("Rajesh");
t2.setName("Vinod");
t1.start();
t2.start();



}
}

