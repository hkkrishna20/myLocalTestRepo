class Box
{
private double width;
private double height;
private double depth;

Box(double width,double height,double depth)
{
this.width=width;
this.height=height;
this.depth=depth;
System.out.println(" this = " + this);

}

double volume()
{
return (width * height * depth);
}
}

class sam15
{
public static void main(String args[]) 
{
Box mybox1 = new Box(12,4,5);
double vol;

vol=mybox1.volume();
System.out.println(" Volume is " + vol);

}
}




