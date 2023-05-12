class geo
{
int area;
void cal_area()
{
System.out.println("Inside geo area");
}

}
class square extends geo
{
void cal_area()
{
System.out.println("Inside square area");
}
}
class testinh
{
public static void main(String args[])
{
geo s1=new square();
s1.cal_area();

}
}