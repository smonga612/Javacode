class student
{
String name;
int roll_no;
student(String name,int roll_no)
{
System.out.println("Inside parameterized constructor");
this.name=name;
this.roll_no=roll_no;
}
student()
{
System.out.println("Inside default constructor");
name="No name exist";
roll_no=-9999;
}

void setName(String name)
{
this.name=name;
}
void setRollno(int roll_no)
{
this.roll_no=roll_no;
}

String getName()
{
return(name);
}
int getRollno()
{
return(roll_no);
}
}
class teststudent
{
public static void main(String args[])
{
student s1=new student("Vishal",1234);
student s2=new student();
//s1.setName("Rahul");
//s1.setRollno(1234);
System.out.println("Name :"+s1.getName());
System.out.println("Roll No :"+s1.getRollno());
System.out.println("******************************");
System.out.println("Name :"+s2.getName());
System.out.println("Roll No :"+s2.getRollno());

}




}