class triangle
{
private double b;
private double h;

double area()
{
return ( (b * h) / 2);
}

void Set_tri(double x,double y)
{
b=x;
h=y;
}

}

class sam13
{
public static void main(String args[])
{
triangle t1 = new triangle();
triangle t2 = new triangle();
double ar,a,b,c,d;
a=Double.parseDouble(args[0]);
b=Double.parseDouble(args[1]);
c=Double.parseDouble(args[2]);
d=Double.parseDouble(args[3]);

t1.Set_tri(a,b);

ar=t1.area();

System.out.println(" Area is "  + ar);

t2.Set_tri(c,d);
ar=t2.area();
System.out.println(" Area is "  + ar);


}
}




