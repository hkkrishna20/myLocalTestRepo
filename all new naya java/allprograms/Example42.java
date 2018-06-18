class book 
{
String title;
double s;
book(String t,double sa)
{
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
System.out.println("Title  " + title+ " Sales"+s);
}
}

class auth extends book
{
double c;

auth(String t,double sa)
{
title=t;
s=sa;
c=0;
}


auth()
{
super();
c=0;
}

public void show()
{
c=s*0.4;
System.out.println("Title  " + title+ " Sales"+s);
System.out.println("Commision:  " + c);

}
}




class Example42
{
public static void main(String args[])
{
auth a1 = new auth("c++",45000);
a1.c=9000;
a1.show();
}
}






