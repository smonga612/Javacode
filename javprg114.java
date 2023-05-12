//Addition of n numbers using command line argument

class test
{
public static void main(String args[])
{
int s=0;
for(int i=0;i<args.length;i++)
System.out.println(i+" Argument "+args[i]);

for(String v :args)
s=s+Integer.parseInt(v);
System.out.println("Result is "+s);

}
}