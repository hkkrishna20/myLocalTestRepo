class person 
{
String n;
int age;
person(String t,int a)
{
n=t;
age=a;
}

person()
{
n=" ";
age=0;
}

public void show()
{
System.out.println("Name  " + n+ " Age: "+age);
}
}

class auth extends person
{
double c;

auth(String t,int x,double sa)
{
super(t,x);
c=sa;
}


auth()
{
super();
c=0;
}

public void show()
{
super.show();
System.out.println("Commision:  " + c);
}
}



class player extends person
{
String sp;
int r;

player(String t,int x,String p,int ra)
{
super(t,x);
sp=p;
r=ra;
}


player()
{
super();
sp=" ";
r=0;
}

public void show()
{
super.show();
System.out.println("Sports:  " + sp+" Rank: "+r);
}
}




class Example44
{
public static void main(String args[])
{
auth a1 = new auth("rao",43,45000);
player p1 = new player("ajay",24,"tennis",43);
a1.show();
p1.show();
}
}






