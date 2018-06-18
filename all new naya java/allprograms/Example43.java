class A 
{
protected int a,b;
A()
{
a=b=0;
}
public void show()
{
System.out.println("a=" +a+ " b="+b);
}
}

class C extends A
{
int c;

C()
{
super();
c=0;
}
void get(int i,int j)
{
a=i;
b=j;
}

public void show()
{
c=a+b;
System.out.println("sum=   " + c);

}
}




class Example43
{
public static void main(String args[])
{
C x= new C();
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
x.get(i,j);
x.show();
}
}






