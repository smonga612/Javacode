class InvalidAccountException extends Exception
{
public InvalidAccountException(String msg)
{
super(msg);
}

}

class bank
{
public void checkaccount(int acc) throws InvalidAccountException
{
if (acc < 1000)
throw new InvalidAccountException("Customer Invalid account no.");
else
System.out.println("Valid account no.");
}

}

class custexp
{
public static void main(String args[]) throws InvalidAccountException
{
bank b1=new bank();
try
{
b1.checkaccount(200);
}catch(InvalidAccountException ae)
{
System.out.println(ae.getMessage());
}

System.out.println("Rest of the code..");
}
}