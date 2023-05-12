class test
{
public static void main(String args[])
{
int i;
int size_array;
size_array=Integer.parseInt(args[0]);
int num[]=new int[size_array];
for (i=0;i<num.length;i++)
{
num[i]=i+1;
}
for(int v:num)
{
System.out.println("Value of num is "+v);
}
}
}