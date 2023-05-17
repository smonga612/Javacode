class testthread
{
public static void main(String args[])
{
new Thread()
{
public void run()
{
int i;
for(i=1;i<10;i++)
{
System.out.println("Value of i is---->"+i);
}
}
}.start();

new Thread()
{
public void run()
{
int j;
for(j=10;j>0;j--)
{
System.out.println("Value of j is---> "+j);
}
}
}.start();

}
}