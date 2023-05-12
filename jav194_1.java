class student
{
String name;
int Rollno;
int Mobileno;
void setName(String n)
{
name=n;
}
void setRollno(int roll)
{
Rollno=roll;
}
void setMobileno(int mno)
{
Mobileno=mno;
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
public static void main(String[] args)
{
student s1=new student();
student s2=new student();
s1.setName("Ravi");
s1.setRollno(123);
s1.setMobileno(987654);
System.out.println("Name :"+s2.getName());
System.out.println("Roll No :"+s2.getRollno());
System.out.println("Mobile No :"+s2.getMobileno());


}

}
