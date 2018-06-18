interface perform
{
public void show();
}

class student implements perform
{
int m,n,avg;
student(int x,int y)
{ m=x;
n=y;
}
public void show()
{
avg=(m+n)/2;
if(avg>=90)
System.out.println("  Excellent!");
else
System.out.println("  Good!");
}
}

class bike implements perform
{
int km;
bike(int x){ km=x;}
public void show()
{
if(km>=90)
System.out.println("  Excellent!");
else
System.out.println("  Good!");
}
}

public class interface3
{
public static void main(String a[])
{
student s=new student(88,99);
bike v=new bike(95);
s.show();
v.show();
}
}