class student
{
private String name;
private int rollno;

void setname(String name)
{
this.name=name;
}
void setrollno(int rollno)
{
this.rollno=rollno;
}

String getname()
{
return(name);
}
int getrollno()
{
return(rollno);
}



}
class teststudent
{
public static void main(String args[])
{
student s1=new student();
s1.setname("Rahul");
s1.setrollno(123);
System.out.println(s1.getname()+" "+s1.getrollno());
}
}
