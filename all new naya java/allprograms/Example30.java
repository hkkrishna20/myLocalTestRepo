//Instance Variable Hiding 

class Box
{
double width;
double height;
double depth;
double vol;

Box(double width,double height,double depth)
{
this.width=width;
this.height=height;
this.depth=depth;
}

void put()
{
vol=(width * height * depth);
System.out.println("This Object Reference  =" + this);
System.out.println("Volume=   " + vol);
}
}

class Example30
{
public static void main(String args[])
{
Box mybox1 = new Box(12,4,5);

mybox1.put();
Box mybox2 = new Box(1,4,5);

mybox2.put();

}
}




