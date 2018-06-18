class pub
{
private String name,add;

pub(String n,String y)
{
name=n;
add=y;
}
pub()
{
name=" ";
add=" ";
}

void show()
{
System.out.println(" Name " + name);
System.out.println(" Address  " + add);
}
}

class book extends pub
{
String title;
double s;

book(String n,String x,String t,double sa)
{
super(n,x);
title=t;
s=sa;
}


book()
{
super();
s=0;
}

public void show()
{
super.show();
System.out.println("Title  " + title+ " Sales"+s);
}
}

class Example41
{
public static void main(String args[])
{
book  e1 = new book("bpb","hyd","c++",45000);
book  e2 = new book();

e1.show();
e2.show();
}
}






