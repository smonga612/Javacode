class test
{
public static void main(String args[])
{
int data[]=new int[4];
int [] data1=new int[4];
int [] data2;
data2=new int[4];
int data3[]=new int[]{1,2,3,4};
for( int n:data)
System.out.println("Value of data is "+n);
System.out.println("-------------------");

for( int n:data1)
System.out.println("Value of data1 is "+n);
System.out.println("-------------------");

for( int n:data2)
System.out.println("Value of data2 is "+n);
System.out.println("-------------------");

for( int n:data3)
System.out.println("Value of data3 is "+n);
System.out.println("-------------------");


}


}