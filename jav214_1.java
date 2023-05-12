
import java.util.Scanner;

class student
{
String name;
int Rollno;
int Mobileno;
void setName(String name)
{
this.name=name;
}
void setRollno(int Rollno)
{
this.Rollno=Rollno;
}
void setMobileno(int Mobileno)
{
this.Mobileno=Mobileno;
}

String getName()
{
return(name);
}
int getRollno()
{
return(Rollno);
}
int getMobileno()
{
return(Mobileno);
}
}
class test
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int n;
System.out.println("Please enter the number of object you want to create");
n=sc.nextInt();


student s[]=new student[n];

for( int i=0;i<n;i++)
{
sc.nextLine();
s[i]=new student();
System.out.println("enter the name" );
String nam=sc.nextLine();
s[i].setName(nam);
System.out.println("enter the Roll Number" );
//int rno=sc.nextInt();
s[i].setRollno((int)0106);
System.out.println("enter the Mobile Number" );
int mno=sc.nextInt();
s[i].setMobileno(mno);
}
for( int i=0;i<n;i++)
{
System.out.println("Name :"+s[i].getName());
System.out.println("Roll No :"+s[i].getRollno());
System.out.println("Mobile No :"+s[i].getMobileno());
}


}


}