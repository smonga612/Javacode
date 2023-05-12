class emp
{
String name;
int empid;
emp(String name,int empid)
{
this.name=name;
this.empid=empid;
}
emp()
{
name="";
empid=-1;
}
emp(emp temp)
{
name=temp.name;
empid=temp.empid;
}


String getName()
{
return(name);
}
int getempid()
{
return(empid);
}
void setName(String name)
{
this.name=name;
}
void  setempid(int empid)
{
this.empid=empid;

}

}
class testemp
{
public static void main(String args[])
{
emp e1=new emp("Rajesh",2333);
emp e2=new emp();
emp e3=new emp(e1);
e3.setName("Rahul");
e3.setempid(8383);

//System.out.println(e1.toString());
//System.out.println(e3.toString());
/*
System.out.println("Name "+e1.getName());
System.out.println("Empid "+e1.getempid());
System.out.println("********************");
System.out.println("Name "+e2.getName());
System.out.println("Empid "+e2.getempid());
System.out.println("********************");
System.out.println("Name "+e3.getName());
System.out.println("Empid "+e3.getempid());
*/
String s1=new String("Hello");
String s2=s1;
//s2="Good";

System.out.println(s1.hashCode()+" "+s1);
System.out.println(s2.hashCode()+" "+s2);
 

}
}






