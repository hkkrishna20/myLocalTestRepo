package pack;
public class haripack15
{
public static int result;
public static int fact(int a)
{
result=1;
while(a!=1)
{
result=result*a;
a--;
}
return result;
}
public static int sum_of_n(int a)
{
result=0;
while(a!=0)
{
result=result+a;
a--;
}
return result;
}
public static void display(int a)
{
System.out.println(a);
}
}