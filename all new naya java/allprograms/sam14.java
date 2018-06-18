class triangle
{
private double b;
private double h;

triangle()
{
System.out.println(" Constructor Invoked : ");
b=2;
h=2;
}
triangle(double x,double y)
{
 a=x;
 b=y;
}
double area()
{
return ( (b * h) / 2);
}
}

class sam14
{
public static void main(String args[])
{
triangle t1 = new triangle();
double ar;
ar=t1.area();
System.out.println(" Area is "  + ar);
}
}




