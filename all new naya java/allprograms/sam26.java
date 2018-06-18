class A
{
int i;
private int j;
void setij(int x,int y)
{
i=x;
j=y;
}
}

class B extends A
{
int k;
void sum()
{
k = i + j;
}
}


class sam26
{
public static void main(String args[])
{
B y=new B();
y.setij(10,20);
y.sum();
System.out.println(" Total is " + y.k);
}
}



