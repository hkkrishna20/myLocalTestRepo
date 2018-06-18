class A
{

private int i,j;

A()
{
i=j=0;
}

A(int a,int b)
{
i=a;
j=b;
}

void show()
{
System.out.println(" i and j " + i + "   " + j);
}

int suma()
{
 return(i+j);
}

}

class B extends A
{
private int k;

B()
{
super();
k=0;
}

B(int a,int b,int c)
{
super(a,b);
k=c;
}
void showk()
{

System.out.println(" k : " + k);
}

void sum()
{
System.out.println(" i + j + k :" + (super.suma()+k));
}


}

class Example40
{
public static void main(String args[])
{
B y=new B(10,20,30);
System.out.println(" Sub class  :  ");
y.show();
y.showk();
y.sum();
}
}
