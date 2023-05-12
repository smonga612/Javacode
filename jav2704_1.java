class student
{
String name;
int rollno;
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

class privatestudent extends student
{
String eligble;
void seteligble(String eligble)
{
this.eligble=eligble;
}
String geteligble()
{
return(eligble);
}

}

class regularstudent extends student
{
int attendance;
void setattendance(int attendance)
{
this.attendance=attendance;
}
int getattendance()
{
return(attendance);
}

}

class teststudent
{
public static void main(String args[])
{
privatestudent ps=new privatestudent();
ps.setname("rahul");
ps.setrollno(123);
ps.seteligble("Yes");
System.out.println("Name :"+ps.getname());
System.out.println("Roll no :"+ps.getrollno());
System.out.println("Eligble :"+ps.geteligble());

regularstudent rs=new regularstudent();
rs.setname("rohit");
rs.setrollno(12356);
rs.setattendance(76);
System.out.println("Name :"+rs.getname());
System.out.println("Roll no :"+rs.getrollno());
System.out.println("Eligble :"+rs.getattendance());


}

}
