interface rbi
{
public int rateofinterest();

}


class sbi implements rbi
{
public int rateofinterest()
{
return(6);
}

}

class pnb implements rbi
{
public int rateofinterest()
{
return(7);
}

}
class sbm extends sbi implements rbi
{
public int rateofinterest()
{
return(5);
}

}
class bankimp
{
public static void main(String args[])
{
sbi s=new sbi();
pnb pb=new pnb();
sbm sm=new sbm();
System.out.println("SBI rate of interest is "+s.rateofinterest());
System.out.println("PNB rate of interest is "+pb.rateofinterest());
System.out.println("SBM rate of interest is "+sm.rateofinterest());


}



}