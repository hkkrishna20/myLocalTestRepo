class Box
{
private double width;
private double height;
private double depth;
private double vol;
Box(double w,double h,double d)
{
width=w;
height=h;
depth=d;
}
double volume()
{
return width*height*depth;
}
}

class BoxWeight extends Box
{
double weight;

BoxWeight(double w,double h,double d,double m)
{
super(w,h,d);
//width=w;
//height=h;
//depth=d;
weight=m;
}
}

class sam27
{
public static void main(String args[])
{
BoxWeight  mybox1 = new BoxWeight(10,20,15,34.5);
BoxWeight  mybox2 = new BoxWeight(2,3,4,0.0765);

double vol;
vol=mybox1.volume();
System.out.println(" volume " + vol);
System.out.println(" Weight  " + mybox1.weight);

vol=mybox2.volume();
System.out.println(" volume " + vol);
System.out.println(" Weight  " + mybox2.weight);

}
}




