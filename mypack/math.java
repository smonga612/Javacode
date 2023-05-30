package mypack;

public class math
{

public int square(int x)
{
return(x*x);
}
public int cube(int x)
{
return(x*x*x);
}
public int power(int x,int y)
{
int s=1;
for(int i=1;i<=y;i++)
s=s*x;
return(s);
}

}