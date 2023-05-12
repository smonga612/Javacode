class test
{
public static void main(String args[])
{
int marks[][]=new int[3][];
marks[0]=new int [5];
marks[1]=new int [8];
marks[2]=new int [3];
for(int i=0;i<3;i++)
{
for (int j=0;j<marks[i].length;j++)
{
marks[i][j]=(i+j+2)*10;
}
}

for(int n[]:marks)
{
System.out.println("");
for (int data: n)
{
System.out.print(data+" ");
}
}


}






}