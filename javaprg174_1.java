class test
{
public static void main(String args[])
{
int marks[][][]=new int[3][2][5];
for(int i=0;i<3;i++)
{
for(int j=0;j<2;j++)
{
for(int k=0;k<5;k++)
{
marks[i][j][k]=5*(j+k+1);
}
}
}
for(int i=0;i<3;i++)
{
for(int j=0;j<2;j++)
{
for(int k=0;k<5;k++)
{
System.out.println("Marks of college "+(i+1) + " of class "+(j+1) + " for student "+(k+1)+" is "+marks[i][j][k]);
}
}
}






}
}