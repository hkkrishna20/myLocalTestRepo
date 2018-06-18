class triangle
{
 private double a;
 private double b;
 triangle(double x,double y)
{
 a=x;
 b=y;
}
double ar()
{
 double q;
 q=(a*b)/2;
 return q;
}
}
class Example26
{
 public static void main(String arg[])
{
 
 double l,h,r;
 l=Double.parseDouble(arg[0]);
 h=Double.parseDouble(arg[1]); 
 triangle x=new triangle(l,h);
 r=x.ar();
 System.out.println(" Area : "+r);
}
}
 