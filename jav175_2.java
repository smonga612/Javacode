class testthread
{
 static int x=10;

public static void main(String args[])
{
/*new Thread(new Runnable()
{
public void run()
{
System.out.println("inside thread"); 
}}
).start();*/


new Thread(
()->{
for(int i=1;i<10;i++)
System.out.println("Value of i is "+i);
System.out.println("value of x is "+ ++x);
}
).start();

new Thread(
()->{
for(int j=10;j>0;j--)
System.out.println("Value of j is "+j);
System.out.println("value of x is "+ ++x);

}
).start();




}
}