interface vechile
{
public void move();
}

class car implements vechile
{
public void move()
{
System.out.println("Journey started by car");
}

}

class bus implements vechile
{
public void move()
{
System.out.println("Journey started by bus");
}

}

class train implements vechile
{
public void move()
{
System.out.println("Journey started by train");
}


}

class journey
{
void startjourney(vechile v)
{
v.move();
}
}

class travelimp
{
public static void main(String args[])
{
car c1=new car();
bus b1=new bus();
train t1=new train();
journey p1=new journey();
journey p2=new journey();
journey p3=new journey();

p1.startjourney(c1);
p2.startjourney(b1);
p3.startjourney(t1);

}
}




