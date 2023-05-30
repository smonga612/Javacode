import java.util.LinkedList;
class pc
{
LinkedList <Integer> list=new LinkedList<>();
int capacity=3;

void produce() throws Exception
{
int value=0;
while(true)
{
synchronized(this)
{

while(list.size()==capacity)
wait();
value++;
list.add(value);
notify();
System.out.println("Producer produced-"+value);
Thread.sleep(100);
}
}
}

void consume() throws Exception
{
while(true)
{
synchronized(this)
{
while(list.size()==0)
wait();
int val=list.removeFirst();
notify();
System.out.println("Consumer consume-"+val);

Thread.sleep(100);
}
}
}
}

public class pcthread
{
public static void main(String args[]) 
{
pc p1=new pc();
Thread t1=new Thread(new Runnable()
{
public void run()
{
try
{
p1.produce();
}catch(Exception e)
{
}
}
});

Thread t2=new Thread(new Runnable()
{
public void run()
{
try
{
p1.consume();
}
catch(Exception e)
{
}
}
});
t1.start();
t2.start();



}
}

